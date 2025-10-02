package androidx.media3.extractor.metadata.flac;

import androidx.camera.core.impl.b;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;

@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public class VorbisComment implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final String f3285a;
    public final String b;

    public VorbisComment(String str, String str2) {
        this.f3285a = Ascii.c(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.common.Metadata.Entry
    public final void c(MediaMetadata.Builder builder) {
        String str = this.f3285a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\t';
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c) {
            case 0:
                Integer numG = Ints.g(str2);
                if (numG != null) {
                    builder.i = numG;
                    break;
                }
                break;
            case 1:
                Integer numG2 = Ints.g(str2);
                if (numG2 != null) {
                    builder.v = numG2;
                    break;
                }
                break;
            case 2:
                Integer numG3 = Ints.g(str2);
                if (numG3 != null) {
                    builder.h = numG3;
                    break;
                }
                break;
            case 3:
                builder.c = str2;
                break;
            case 4:
                builder.w = str2;
                break;
            case 5:
                builder.f2867a = str2;
                break;
            case 6:
                builder.e = str2;
                break;
            case 7:
                Integer numG4 = Ints.g(str2);
                if (numG4 != null) {
                    builder.u = numG4;
                    break;
                }
                break;
            case '\b':
                builder.d = str2;
                break;
            case '\t':
                builder.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.f3285a.equals(vorbisComment.f3285a) && this.b.equals(vorbisComment.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + b.c(527, 31, this.f3285a);
    }

    public final String toString() {
        return "VC: " + this.f3285a + "=" + this.b;
    }
}
