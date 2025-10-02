package androidx.media3.extractor.metadata.id3;

import androidx.camera.core.impl.b;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class TextInformationFrame extends Id3Frame {
    public final String b;
    public final ImmutableList c;

    /* JADX WARN: Multi-variable type inference failed */
    public TextInformationFrame(String str, String str2, List list) {
        super(str);
        Assertions.b(!((AbstractCollection) list).isEmpty());
        this.b = str2;
        ImmutableList immutableListO = ImmutableList.o(list);
        this.c = immutableListO;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    @Override // androidx.media3.common.Metadata.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.media3.common.MediaMetadata.Builder r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.TextInformationFrame.c(androidx.media3.common.MediaMetadata$Builder):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextInformationFrame.class == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (Objects.equals(this.f3291a, textInformationFrame.f3291a) && Objects.equals(this.b, textInformationFrame.b) && this.c.equals(textInformationFrame.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = b.c(527, 31, this.f3291a);
        String str = this.b;
        return this.c.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f3291a + ": description=" + this.b + ": values=" + this.c;
    }
}
