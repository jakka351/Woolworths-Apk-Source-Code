package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Streams {

    /* loaded from: classes6.dex */
    public static final class AppendableWriter extends Writer {

        public static class CurrentWrite implements CharSequence {
            public char[] d;
            public String e;

            @Override // java.lang.CharSequence
            public final char charAt(int i) {
                return this.d[i];
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.d.length;
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i, int i2) {
                return new String(this.d, i, i2 - i);
            }

            @Override // java.lang.CharSequence
            public final String toString() {
                if (this.e == null) {
                    this.e = new String(this.d);
                }
                return this.e;
            }
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(CharSequence charSequence) {
            throw null;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer
        public final void write(int i) {
            throw null;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            throw null;
        }

        @Override // java.io.Writer
        public final void write(String str, int i, int i2) {
            Objects.requireNonNull(str);
            throw null;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(CharSequence charSequence, int i, int i2) {
            throw null;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            throw null;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw null;
        }
    }

    public static JsonElement a(JsonReader jsonReader) {
        boolean z;
        try {
            try {
                jsonReader.peek();
                z = false;
                try {
                    return (JsonElement) TypeAdapters.z.read(jsonReader);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return JsonNull.d;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException(e2);
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            } catch (NumberFormatException e4) {
                throw new JsonSyntaxException(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }
}
