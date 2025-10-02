package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Format g;
    public static final Format h;

    /* renamed from: a, reason: collision with root package name */
    public final String f3282a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        Format.Builder builder = new Format.Builder();
        builder.m = MimeTypes.m("application/id3");
        g = new Format(builder);
        Format.Builder builder2 = new Format.Builder();
        builder2.m = MimeTypes.m("application/x-scte35");
        h = new Format(builder2);
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f3282a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final byte[] a() {
        if (b() != null) {
            return this.e;
        }
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final Format b() {
        String str = this.f3282a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EventMessage.class == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            if (this.c == eventMessage.c && this.d == eventMessage.d && Objects.equals(this.f3282a, eventMessage.f3282a) && Objects.equals(this.b, eventMessage.b) && Arrays.equals(this.e, eventMessage.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.f3282a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.c;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f3282a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
