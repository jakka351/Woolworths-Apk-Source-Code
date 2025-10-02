package com.adobe.mobile;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/* loaded from: classes4.dex */
class RemoteDownload {

    public static class DownloadFileTask implements Runnable {
        public final RemoteDownloadBlock d;
        public final String e;
        public final String f;

        public DownloadFileTask(String str, RemoteDownloadBlock remoteDownloadBlock, String str2) {
            this.e = str;
            this.d = remoteDownloadBlock;
            this.f = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0284 A[Catch: all -> 0x022b, TRY_LEAVE, TryCatch #7 {all -> 0x022b, blocks: (B:126:0x021d, B:127:0x021f, B:129:0x0226, B:138:0x023d, B:140:0x0248, B:153:0x0275, B:155:0x0284, B:165:0x02a7, B:167:0x02b6, B:177:0x02d9, B:179:0x02e8, B:189:0x0309, B:191:0x0314), top: B:220:0x0134 }] */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0292 A[Catch: IOException -> 0x028e, TryCatch #20 {IOException -> 0x028e, blocks: (B:157:0x028a, B:161:0x0292, B:162:0x0295), top: B:235:0x028a }] */
        /* JADX WARN: Removed duplicated region for block: B:167:0x02b6 A[Catch: all -> 0x022b, TRY_LEAVE, TryCatch #7 {all -> 0x022b, blocks: (B:126:0x021d, B:127:0x021f, B:129:0x0226, B:138:0x023d, B:140:0x0248, B:153:0x0275, B:155:0x0284, B:165:0x02a7, B:167:0x02b6, B:177:0x02d9, B:179:0x02e8, B:189:0x0309, B:191:0x0314), top: B:220:0x0134 }] */
        /* JADX WARN: Removed duplicated region for block: B:173:0x02c4 A[Catch: IOException -> 0x02c0, TryCatch #13 {IOException -> 0x02c0, blocks: (B:169:0x02bc, B:173:0x02c4, B:174:0x02c7), top: B:227:0x02bc }] */
        /* JADX WARN: Removed duplicated region for block: B:179:0x02e8 A[Catch: all -> 0x022b, TRY_LEAVE, TryCatch #7 {all -> 0x022b, blocks: (B:126:0x021d, B:127:0x021f, B:129:0x0226, B:138:0x023d, B:140:0x0248, B:153:0x0275, B:155:0x0284, B:165:0x02a7, B:167:0x02b6, B:177:0x02d9, B:179:0x02e8, B:189:0x0309, B:191:0x0314), top: B:220:0x0134 }] */
        /* JADX WARN: Removed duplicated region for block: B:185:0x02f6 A[Catch: IOException -> 0x02f2, TryCatch #4 {IOException -> 0x02f2, blocks: (B:181:0x02ee, B:185:0x02f6, B:186:0x02f9), top: B:218:0x02ee }] */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0314 A[Catch: all -> 0x022b, TRY_LEAVE, TryCatch #7 {all -> 0x022b, blocks: (B:126:0x021d, B:127:0x021f, B:129:0x0226, B:138:0x023d, B:140:0x0248, B:153:0x0275, B:155:0x0284, B:165:0x02a7, B:167:0x02b6, B:177:0x02d9, B:179:0x02e8, B:189:0x0309, B:191:0x0314), top: B:220:0x0134 }] */
        /* JADX WARN: Removed duplicated region for block: B:197:0x0322 A[Catch: IOException -> 0x031e, TryCatch #25 {IOException -> 0x031e, blocks: (B:193:0x031a, B:197:0x0322, B:198:0x0325), top: B:241:0x031a }] */
        /* JADX WARN: Removed duplicated region for block: B:206:0x033f A[Catch: IOException -> 0x033b, TryCatch #15 {IOException -> 0x033b, blocks: (B:202:0x0337, B:206:0x033f, B:207:0x0342), top: B:229:0x0337 }] */
        /* JADX WARN: Removed duplicated region for block: B:218:0x02ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:227:0x02bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:229:0x0337 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:235:0x028a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:241:0x031a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v49 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r5v13, types: [int] */
        /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.String] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 866
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adobe.mobile.RemoteDownload.DownloadFileTask.run():void");
        }
    }

    public interface RemoteDownloadBlock {
        void a(File file);
    }

    public static File a(String str, Date date, String str2, String str3) {
        String strG;
        if (str == null || str.length() < 1) {
            StaticMethods.K("Cached File - Invalid url parameter while attempting to create cache file. Could not save data.", new Object[0]);
            return null;
        }
        if (str2 == null || str2.length() < 1) {
            StaticMethods.K("Cached File - Invalid etag parameter while attempting to create cache file. Could not save data.", new Object[0]);
            return null;
        }
        File fileD = d(str3);
        if (fileD == null || (strG = g(str)) == null || strG.length() < 1) {
            return null;
        }
        return new File(fileD.getPath() + File.separator + g(str) + "." + date.getTime() + "_" + str2);
    }

    public static void b(String str, String str2) {
        if (str == null || str.length() < 1) {
            StaticMethods.K("Cached File - tried to delete cached file, but file path was empty", new Object[0]);
            return;
        }
        File fileE = e(str, str2);
        if (fileE != null) {
            fileE.delete();
        }
    }

    public static void c() {
        File[] fileArrListFiles;
        File fileD = d("messageImages");
        if (fileD == null || (fileArrListFiles = fileD.listFiles()) == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.delete()) {
                StaticMethods.I("Cached File - Removed unused cache file", new Object[0]);
            } else {
                StaticMethods.K("Cached File - Failed to remove unused cache file", new Object[0]);
            }
        }
    }

    public static File d(String str) {
        File file = new File(StaticMethods.o(), str);
        if (file.exists() || file.mkdir()) {
            return file;
        }
        StaticMethods.K("Cached File - unable to open/make download cache directory", new Object[0]);
        return null;
    }

    public static File e(String str, String str2) {
        File fileD;
        if (str != null && str.length() >= 1 && (fileD = d(str2)) != null) {
            String[] list = fileD.list();
            if (list != null && list.length >= 1) {
                String strG = g(str);
                for (String str3 : list) {
                    if (str3.substring(0, str3.lastIndexOf(46)).equals(strG)) {
                        return new File(fileD, str3);
                    }
                }
                StaticMethods.I("Cached Files - This file has not previously been cached (%s).", str);
                return null;
            }
            StaticMethods.I("Cached Files - Directory is empty (%s).", fileD.getAbsolutePath());
        }
        return null;
    }

    public static String f(String str) {
        if (str.length() >= 1) {
            return str.substring(str.lastIndexOf(".") + 1);
        }
        StaticMethods.K("Cached File - Path was null or empty for Cache File", new Object[0]);
        return null;
    }

    public static String g(String str) throws NoSuchAlgorithmException {
        if (str != null && str.length() >= 1) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes("UTF-8"));
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    String hexString = Integer.toHexString(b & 255);
                    while (hexString.length() < 2) {
                        hexString = "0" + hexString;
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            } catch (UnsupportedEncodingException e) {
                StaticMethods.J("Cached Files - Unsupported Encoding: UTF-8 (%s)", e.getMessage());
            } catch (NoSuchAlgorithmException e2) {
                StaticMethods.J("Cached Files - unable to get md5 hash (%s)", e2.getMessage());
            }
        }
        return null;
    }

    public static String[] h(String str) {
        if (str == null || str.length() < 1) {
            StaticMethods.K("Cached File - Extension was null or empty on Cache File", new Object[0]);
            return null;
        }
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length == 2) {
            return strArrSplit;
        }
        StaticMethods.K("Cached File - Invalid Extension on Cache File (%s)", str);
        return null;
    }
}
