package androidx.media3.common;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class Metadata {

    /* renamed from: a, reason: collision with root package name */
    public final Entry[] f2868a;
    public final long b;

    public interface Entry {
        default byte[] a() {
            return null;
        }

        default Format b() {
            return null;
        }

        default void c(MediaMetadata.Builder builder) {
        }
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public final Metadata a(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        int i = Util.f2928a;
        Entry[] entryArr2 = this.f2868a;
        Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
        return new Metadata(this.b, (Entry[]) objArrCopyOf);
    }

    public final Metadata b(Metadata metadata) {
        return metadata == null ? this : a(metadata.f2868a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.f2868a, metadata.f2868a) && this.b == metadata.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Longs.a(this.b) + (Arrays.hashCode(this.f2868a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f2868a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public Metadata(long j, Entry... entryArr) {
        this.b = j;
        this.f2868a = entryArr;
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }
}
