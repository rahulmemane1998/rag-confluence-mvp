# Setup Instructions

## PostgreSQL Setup

This application requires PostgreSQL with the `pgvector` extension. Follow these steps to set it up:

### 1. Install PostgreSQL

**Using Homebrew (macOS):**
```bash
brew install postgresql@15
brew services start postgresql@15
```

**Or install PostgreSQL from:**
- https://www.postgresql.org/download/

### 2. Install pgvector Extension

**Using Homebrew (macOS):**
```bash
brew install pgvector
```

**Or build from source:**
```bash
git clone --branch v0.5.1 https://github.com/pgvector/pgvector.git
cd pgvector
make
make install
```

### 3. Create Database and Schema

```bash
# Create database
createdb rag

# Connect to database
psql rag

# Run the schema SQL
\i sql/pgvector_schema.sql
```

Or run the SQL file directly:
```bash
psql rag -f sql/pgvector_schema.sql
```

### 4. Set Environment Variables

Create a `.env` file or export these variables:

**To enable database connection, set:**
```bash
export SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/rag
export SPRING_DATASOURCE_USERNAME=postgres
export SPRING_DATASOURCE_PASSWORD=your_password
```

**Or use the PG_* variables (will be used if SPRING_DATASOURCE_URL is not set):**
```bash
export PG_HOST=localhost
export PG_PORT=5432
export PG_DB=rag
export PG_USER=postgres
export PG_PASSWORD=your_password
```

**Optional: For Confluence integration**
```bash
export CONFLUENCE_EMAIL=your-email@example.com
export CONFLUENCE_API_TOKEN=your-api-token
export CONFLUENCE_BASE_URL=https://your-company.atlassian.net/wiki
```

**Optional: For OpenAI integration**
```bash
export OPENAI_API_KEY=your-openai-api-key
```

### 5. Run the Application

```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 17)
mvn spring-boot:run
```

## Notes

- **Database**: The application will start even without PostgreSQL. To enable database features, set `SPRING_DATASOURCE_URL` environment variable. Without it, the `/api/ask` endpoint will not be available.
- **Confluence**: The application will start even without Confluence credentials, but the crawler service will not be available.
- **OpenAI**: The application will start even without OpenAI API key, but embedding and LLM services will fail at runtime when used.

## Quick Start (Without Database)

If you just want to test the application startup without setting up PostgreSQL:

```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 17)
mvn spring-boot:run
```

The application will start successfully, but database-dependent features will not be available.

