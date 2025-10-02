package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.Writer;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes6.dex */
public final class CharStreams {

    public static final class NullWriter extends Writer {
        static {
            new NullWriter();
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(char c) {
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        public final String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public final void write(int i) {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            Preconditions.m(i, i2 + i, cArr.length);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Appendable append(char c) {
            return this;
        }

        @Override // java.io.Writer
        public final void write(String str, int i, int i2) {
            Preconditions.m(i, i2 + i, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer
        public final void write(String str) {
            str.getClass();
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
            append(charSequence, i, i2);
            return this;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr) {
            cArr.getClass();
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(CharSequence charSequence, int i, int i2) {
            Preconditions.m(i, i2, charSequence == null ? 4 : charSequence.length());
            return this;
        }
    }
}
