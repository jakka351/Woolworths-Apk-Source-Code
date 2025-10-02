package androidx.media3.extractor.mp4;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.ImmutableList;
import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes2.dex */
final class MetadataUtil {
    public static MdtaMetadataEntry a(Metadata metadata, String str) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f2868a;
            if (i >= entryArr.length) {
                return null;
            }
            Metadata.Entry entry = entryArr[i];
            if (entry instanceof MdtaMetadataEntry) {
                MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                if (mdtaMetadataEntry.f2929a.equals(str)) {
                    return mdtaMetadataEntry;
                }
            }
            i++;
        }
    }

    public static CommentFrame b(int i, ParsableByteArray parsableByteArray) {
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() == 1684108385) {
            parsableByteArray.H(8);
            String strQ = parsableByteArray.q(iG - 16);
            return new CommentFrame("und", strQ, strQ);
        }
        Log.g("MetadataUtil", "Failed to parse comment attribute: " + Mp4Box.a(i));
        return null;
    }

    public static ApicFrame c(ParsableByteArray parsableByteArray) {
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() != 1684108385) {
            Log.g("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iG2 = parsableByteArray.g();
        byte[] bArr = BoxParser.f3315a;
        int i = iG2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            androidx.compose.ui.input.pointer.a.t(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        parsableByteArray.H(4);
        int i2 = iG - 16;
        byte[] bArr2 = new byte[i2];
        parsableByteArray.e(0, i2, bArr2);
        return new ApicFrame(str, null, 3, bArr2);
    }

    public static TextInformationFrame d(int i, ParsableByteArray parsableByteArray, String str) {
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() == 1684108385 && iG >= 22) {
            parsableByteArray.H(10);
            int iA = parsableByteArray.A();
            if (iA > 0) {
                String strD = YU.a.d(iA, "");
                int iA2 = parsableByteArray.A();
                if (iA2 > 0) {
                    strD = strD + q2.c + iA2;
                }
                return new TextInformationFrame(str, null, ImmutableList.w(strD));
            }
        }
        Log.g("MetadataUtil", "Failed to parse index/count attribute: " + Mp4Box.a(i));
        return null;
    }

    public static int e(ParsableByteArray parsableByteArray) {
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() == 1684108385) {
            parsableByteArray.H(8);
            int i = iG - 16;
            if (i == 1) {
                return parsableByteArray.u();
            }
            if (i == 2) {
                return parsableByteArray.A();
            }
            if (i == 3) {
                return parsableByteArray.x();
            }
            if (i == 4 && (parsableByteArray.f2922a[parsableByteArray.b] & 128) == 0) {
                return parsableByteArray.y();
            }
        }
        Log.g("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static Id3Frame f(int i, String str, ParsableByteArray parsableByteArray, boolean z, boolean z2) {
        int iE = e(parsableByteArray);
        if (z2) {
            iE = Math.min(1, iE);
        }
        if (iE >= 0) {
            return z ? new TextInformationFrame(str, null, ImmutableList.w(Integer.toString(iE))) : new CommentFrame("und", str, Integer.toString(iE));
        }
        Log.g("MetadataUtil", "Failed to parse uint8 attribute: " + Mp4Box.a(i));
        return null;
    }

    public static TextInformationFrame g(int i, ParsableByteArray parsableByteArray, String str) {
        int iG = parsableByteArray.g();
        if (parsableByteArray.g() == 1684108385) {
            parsableByteArray.H(8);
            return new TextInformationFrame(str, null, ImmutableList.w(parsableByteArray.q(iG - 16)));
        }
        Log.g("MetadataUtil", "Failed to parse text attribute: " + Mp4Box.a(i));
        return null;
    }
}
