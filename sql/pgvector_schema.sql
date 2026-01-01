-- Ensure extension
CREATE EXTENSION IF NOT EXISTS vector;

CREATE TABLE IF NOT EXISTS docs (
  id UUID PRIMARY KEY,
  page_id TEXT,
  title TEXT,
  url TEXT,
  content TEXT,
  embedding vector(1536),
  metadata jsonb,
  last_modified timestamptz
);

CREATE INDEX IF NOT EXISTS docs_embedding_idx ON docs USING ivfflat (embedding vector_cosine_ops) WITH (lists = 100);
