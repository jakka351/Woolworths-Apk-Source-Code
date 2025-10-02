package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes6.dex */
public abstract class ByteSource {

    public class AsCharSource extends CharSource {
        public final String toString() {
            throw null;
        }
    }

    public static class ByteArrayByteSource extends ByteSource {
        public String toString() {
            return "ByteSource.wrap(" + Ascii.d(BaseEncoding.b.c(0, null)) + ")";
        }
    }

    public static final class ConcatenatedByteSource extends ByteSource {
        public final String toString() {
            return "ByteSource.concat(null)";
        }
    }

    public static final class EmptyByteSource extends ByteArrayByteSource {
        @Override // com.google.common.io.ByteSource.ByteArrayByteSource
        public final String toString() {
            return "ByteSource.empty()";
        }
    }

    public final class SlicedByteSource extends ByteSource {
        public final String toString() {
            throw null;
        }
    }
}
