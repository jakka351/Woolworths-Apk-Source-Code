package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.os.Process;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjxjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofilingmodule.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class lllllqq {
    private static final int m006D006D006D006D006Dm = 32;
    private static final int m006D006Dmmm006D = 8192;
    private static final int m006Dmmmm006D = 120;
    private static final int mm006Dmmm006D = 10;
    private static final int mmm006Dmm006D = 1024;
    private static final int mmmmmm006D = 48;

    private lllllqq() {
    }

    public static jjxjxjj.jxxjxjj g006700670067gg0067g() {
        char c;
        String strConcat = "lib".concat(BuildConfig.JNI_FILENAME).concat(".so");
        char[] cArr = new char[m006D006Dmmm006D];
        try {
            int i = -1;
            int length = -1;
            int length2 = -1;
            FileReader fileReader = new FileReader("/proc/" + Process.myPid() + "/maps");
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            int iGg00670067gg0067g = 0;
            int i3 = 0;
            int i4 = -1;
            while (true) {
                if (fileReader == null && i2 < 0) {
                    break;
                }
                if (z) {
                    do {
                        try {
                            c = cArr[iGg00670067gg0067g];
                            iGg00670067gg0067g++;
                        } catch (ArrayIndexOutOfBoundsException | SecurityException unused) {
                        }
                    } while (c != '\n');
                }
                i2 -= iGg00670067gg0067g - i3;
                i3 = iGg00670067gg0067g;
                while (fileReader != null && i2 < 1024) {
                    int iGggg0067g0067g = gggg0067g0067g(cArr, i3, i2, fileReader);
                    if (iGggg0067g0067g < 0) {
                        fileReader = null;
                    } else {
                        i2 += iGggg0067g0067g;
                    }
                    i3 = 0;
                }
                int iGg00670067gg0067g2 = gg00670067gg0067g(cArr, i3);
                boolean z3 = false;
                while (true) {
                    char c2 = cArr[iGg00670067gg0067g2];
                    if (c2 == ' ') {
                        break;
                    }
                    if (c2 == 'x') {
                        z3 = true;
                    }
                    iGg00670067gg0067g2++;
                }
                int i5 = iGg00670067gg0067g2 + 1;
                if (z3) {
                    iGg00670067gg0067g = gg00670067gg0067g(cArr, gg00670067gg0067g(cArr, i5));
                    if (cArr[iGg00670067gg0067g] != '0' || cArr[iGg00670067gg0067g + 1] != ' ') {
                        int iGg00670067gg0067g3 = gg00670067gg0067g(cArr, iGg00670067gg0067g);
                        while (cArr[iGg00670067gg0067g3] == ' ') {
                            iGg00670067gg0067g3++;
                        }
                        int i6 = iGg00670067gg0067g3;
                        while (cArr[i6] != '\n') {
                            i6++;
                        }
                        int i7 = i6 + 1;
                        String str = new String(cArr, iGg00670067gg0067g3, i6 - iGg00670067gg0067g3);
                        if (str.startsWith("/system")) {
                            i++;
                            length = (int) (length + new File(str).length());
                        } else if (str.startsWith("/dev")) {
                            i4++;
                        } else if (str.endsWith(strConcat)) {
                            z2 = true;
                        } else {
                            i4++;
                            length2 = (int) (length2 + new File(str).length());
                        }
                        z = false;
                        iGg00670067gg0067g = i7;
                    }
                } else {
                    iGg00670067gg0067g = i5;
                }
                z = true;
            }
            return new jjxjxjj.jxxjxjj(i, length, i4, length2, z2);
        } catch (FileNotFoundException unused2) {
            return new jjxjxjj.jxxjxjj(-1, -1, -1, -1, false);
        }
    }

    private static int gg00670067gg0067g(char[] cArr, int i) {
        char c;
        do {
            c = cArr[i];
            i++;
        } while (c != ' ');
        return i;
    }

    private static int gggg0067g0067g(@Nonnull char[] cArr, int i, int i2, @Nonnull FileReader fileReader) throws IOException {
        if (i > 0) {
            System.arraycopy(cArr, i, cArr, 0, i2);
        }
        try {
            int i3 = fileReader.read(cArr, i2, 8192 - i2);
            if (i3 > 0) {
                return i3;
            }
            fileReader.close();
            return -1;
        } catch (IOException unused) {
            return -1;
        }
    }
}
