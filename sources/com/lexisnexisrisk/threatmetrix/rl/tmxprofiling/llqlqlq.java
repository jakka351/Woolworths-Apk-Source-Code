package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class llqlqlq {
    private static final String m006D006D006Dmmm = "selinuxfs";
    private static final String mm006D006Dmmm = lqlqqll.u00750075u00750075u(llqlqlq.class);
    private static final int mmmm006Dmm = 10;

    private llqlqlq() {
    }

    @Nullable
    public static lqqlqlq g00670067g00670067gg() throws IOException {
        try {
            String strGg0067g00670067gg = gg0067g00670067gg();
            if (strGg0067g00670067gg == null) {
                return ggg006700670067gg() ? lqqlqlq.UNKNOWN : lqqlqlq.NONE;
            }
            File file = new File(strGg0067g00670067gg.concat("/enforce"));
            lqqlqlq lqqlqlqVarG0067g006700670067gg = g0067g006700670067gg(file);
            lqqlqlq lqqlqlqVar = lqqlqlq.UNKNOWN;
            if (lqqlqlqVarG0067g006700670067gg == lqqlqlqVar) {
                lqlqqll.llqqqll.uuu0075uuu(mm006D006Dmmm, "Can't read enforce file {}");
                if (file.exists()) {
                    return lqqlqlq.ENFORCING;
                }
            }
            return lqqlqlqVar;
        } catch (IOException unused) {
            return lqqlqlq.UNKNOWN;
        }
    }

    private static lqqlqlq g0067g006700670067gg(File file) throws IOException {
        byte[] bArr = new byte[10];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                int i = fileInputStream.read(bArr);
                lqqlqlq lqqlqlqVar = i >= 10 ? lqqlqlq.UNKNOWN : "1".equalsIgnoreCase(new String(Arrays.copyOf(bArr, i))) ? lqqlqlq.ENFORCING : lqqlqlq.PERMISSIVE;
                fileInputStream.close();
                return lqqlqlqVar;
            } finally {
            }
        } catch (IOException e) {
            lqlqqll.llqqqll.u0075u0075uuu(mm006D006Dmmm, "Fail to open file {}", e.toString());
            return lqqlqlq.UNKNOWN;
        } catch (SecurityException e2) {
            lqlqqll.llqqqll.uuu0075uuu(mm006D006Dmmm, e2.toString());
            return lqqlqlq.UNKNOWN;
        }
    }

    private static String gg0067g00670067gg() throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/mounts");
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        fileInputStream.close();
                        return null;
                    }
                    String[] strArrSplit = line.split(" ");
                    if (strArrSplit.length >= 3 && m006D006D006Dmmm.equals(strArrSplit[2])) {
                        String str = strArrSplit[1];
                        fileInputStream.close();
                        return str;
                    }
                }
            } finally {
            }
        } catch (SecurityException e) {
            lqlqqll.llqqqll.uuu0075uuu(mm006D006Dmmm, e.toString());
            return null;
        }
    }

    private static boolean ggg006700670067gg() throws IOException {
        String line;
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/filesystems");
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                do {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        fileInputStream.close();
                        return false;
                    }
                } while (!line.contains(m006D006D006Dmmm));
                fileInputStream.close();
                return true;
            } finally {
            }
        } catch (SecurityException e) {
            lqlqqll.llqqqll.uuu0075uuu(mm006D006Dmmm, e.toString());
            return false;
        }
    }
}
