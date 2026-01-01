# rag-confluence-mvp

A minimal Retrieval-Augmented Generation (RAG) Spring Boot MVP that:
- Crawls Confluence Cloud pages using Confluence REST API
- Cleans & chunks content
- Embeds content using OpenAI embeddings
- Stores vectors in PostgreSQL + pgvector
- Exposes /api/ask for semantic search + LLM summarization

## Setup

1. Create PostgreSQL DB and enable pgvector extension.
2. Run SQL in sql/pgvector_schema.sql
3. Set environment variables:
   - CONFLUENCE_EMAIL
   - CONFLUENCE_API_TOKEN
   - OPENAI_API_KEY
   - PG_HOST, PG_PORT, PG_DB, PG_USER, PG_PASSWORD
4. Build & run:
   mvn clean package
   java -jar target/rag-confluence-mvp-0.0.1-SNAPSHOT.jar

Note: This project is an MVP and uses literal vector insertion for clarity. For production, use parameterized queries or a pgvector client library.
