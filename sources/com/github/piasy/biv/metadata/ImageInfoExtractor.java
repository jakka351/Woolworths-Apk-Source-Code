package com.github.piasy.biv.metadata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ImageInfoExtractor {
    public static int a(File file) throws IOException {
        int i = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[21];
            int i2 = fileInputStream.read(bArr);
            if (i2 >= 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70) {
                i = 1;
            } else if (i2 >= 12 && bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80) {
                i = (i2 >= 17 && bArr[12] == 86 && bArr[13] == 80 && bArr[14] == 56 && bArr[15] == 88 && (bArr[20] & 2) != 0) ? 2 : 3;
            }
            fileInputStream.close();
            return i;
        } catch (IOException e) {
            e.printStackTrace();
            return i;
        }
    }
}
