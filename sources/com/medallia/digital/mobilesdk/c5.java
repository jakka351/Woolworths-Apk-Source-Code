package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaExtractor;
import android.media.MediaRecorder;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.Window;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
class c5 {
    private static final int e = 7;
    private static final int f = 2;
    private static final int g = 3;
    private static final String h = "/media";
    private static final String i = "video/*";
    private static final int j = 1048576;
    private static final int k = 5;
    private static c5 l;

    /* renamed from: a, reason: collision with root package name */
    private MediaRecorder f16397a;
    private ProgressDialog c;
    private g5 b = null;
    private final List<String> d = new ArrayList();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16398a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[z4.values().length];
            b = iArr;
            try {
                iArr[z4.select.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[z4.delete.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[z4.replace.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[z4.permission.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[z4.videoTimeLimitation.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[j5.values().length];
            f16398a = iArr2;
            try {
                iArr2[j5.video.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16398a[j5.audio.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16398a[j5.upload.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a5 f16399a;

        public b(a5 a5Var) {
            this.f16399a = a5Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f16399a.a(z4.ok);
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a5 f16400a;

        public c(a5 a5Var) {
            this.f16400a = a5Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f16400a.a(z4.delete);
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public class e implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a5 f16402a;

        public e(a5 a5Var) {
            this.f16402a = a5Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f16402a.a(z4.replace);
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public class h implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a5 f16405a;

        public h(a5 a5Var) {
            this.f16405a = a5Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f16405a.a(z4.ok);
        }
    }

    public class i extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog.Builder f16406a;
        final /* synthetic */ j2 b;

        public i(AlertDialog.Builder builder, j2 j2Var) {
            this.f16406a = builder;
            this.b = j2Var;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            String str;
            AlertDialog alertDialogCreate = this.f16406a.create();
            try {
                Window window = alertDialogCreate.getWindow();
                if (window != null) {
                    j2 j2Var = this.b;
                    if (j2Var == null || !j2Var.isRtl()) {
                        window.getDecorView().setLayoutDirection(0);
                        window.getDecorView().setTextDirection(3);
                        str = "Dialog direction set to LTR";
                    } else {
                        window.getDecorView().setLayoutDirection(1);
                        window.getDecorView().setTextDirection(4);
                        str = "Dialog direction set to RTL";
                    }
                    a4.e(str);
                }
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
            alertDialogCreate.show();
        }
    }

    public class j extends v4 {
        public j() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            Context contextB = i4.c().b();
            c5.this.c = new ProgressDialog(i4.c().d());
            c5.this.c.setTitle(contextB.getString(R.string.progress_dialog_title));
            c5.this.c.setMessage(contextB.getString(R.string.progress_dialog_body));
            c5.this.c.setProgressStyle(0);
            c5.this.c.setIndeterminate(false);
            c5.this.c.setCancelable(false);
            c5.this.c.show();
        }
    }

    public enum k {
        denyPermission(0),
        allowAudioPermission(1),
        stopAudioRecording(2),
        finishMediaRecording(3),
        unSupportedMediaFormat(4);


        /* renamed from: a, reason: collision with root package name */
        private final int f16408a;

        k(int i) {
            this.f16408a = i;
        }

        public int a() {
            return this.f16408a;
        }
    }

    public static c5 b() {
        if (l == null) {
            l = new c5();
        }
        return l;
    }

    public void c() {
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new j());
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public void d() throws Exception {
        try {
            MediaRecorder mediaRecorder = this.f16397a;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
                this.f16397a.release();
                this.f16397a = null;
                a4.e("Audio recording was finished");
            }
        } catch (Exception e2) {
            a4.c(YU.a.f(e2, new StringBuilder("Audio Recorder doesn't exist ")));
            throw new Exception();
        }
    }

    public String b(Uri uri, String str, String str2) throws IOException {
        File fileA = a(str, str2);
        try {
            FileInputStream fileInputStreamCreateInputStream = i4.c().b().getContentResolver().openAssetFileDescriptor(uri, "r").createInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
            byte[] bArr = new byte[j];
            while (true) {
                int i2 = fileInputStreamCreateInputStream.read(bArr);
                if (i2 <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i2);
                fileOutputStream.flush();
            }
            fileInputStreamCreateInputStream.close();
            fileOutputStream.close();
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
        return fileA.getAbsolutePath();
    }

    public e5 a(g5 g5Var, j2 j2Var, boolean z) {
        Activity activity = (Activity) i4.c().d().getBaseContext();
        this.b = g5Var;
        ArrayList arrayList = new ArrayList();
        String strD = g5Var.d();
        if (strD != null && !strD.isEmpty()) {
            int i2 = a.f16398a[j5.a(strD).ordinal()];
            if (i2 == 1) {
                int iA = ContextCompat.a(activity, "android.permission.CAMERA");
                if (iA == 0 || this.d.isEmpty() || !this.d.contains("android.permission.CAMERA")) {
                    if (iA != 0) {
                        arrayList.add("android.permission.CAMERA");
                    } else {
                        a(activity, g5Var.e());
                    }
                }
                a(z4.permission, (a5<z4>) null, j2Var, z);
                return null;
            }
            if (i2 == 2) {
                int iA2 = ContextCompat.a(activity, "android.permission.RECORD_AUDIO");
                if (iA2 == 0 || this.d.isEmpty() || !this.d.contains("android.permission.RECORD_AUDIO")) {
                    if (iA2 == 0) {
                        return a(strD, j2Var.getFormId(), j2Var.b(), g5Var.c());
                    }
                    arrayList.add("android.permission.RECORD_AUDIO");
                }
                a(z4.permission, (a5<z4>) null, j2Var, z);
                return null;
            }
            if (i2 == 3) {
                a(activity);
            }
        }
        if (!arrayList.isEmpty()) {
            ActivityCompat.j(activity, (String[]) arrayList.toArray(new String[0]), 7);
        }
        return null;
    }

    public void b(String str) {
        if (str == null || this.d.contains(str)) {
            return;
        }
        this.d.add(str);
    }

    public e5 a(String str, String str2, String str3, String str4) throws IllegalStateException, IOException {
        File file = new File(g2.f(h));
        String string = UUID.randomUUID().toString();
        String str5 = file + q2.c + string + j5.c(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f16397a = mediaRecorder;
        mediaRecorder.setAudioSource(1);
        this.f16397a.setOutputFormat(1);
        this.f16397a.setAudioEncoder(4);
        this.f16397a.setOutputFile(str5);
        try {
            this.f16397a.prepare();
            this.f16397a.start();
            a4.b("Start record audio was call");
            return new e5(string, null, str5, str2, str3, j5.b(str), System.currentTimeMillis(), str4, 0);
        } catch (Exception e2) {
            a4.e(YU.a.f(e2, new StringBuilder("Cannot record audio media ")));
            return null;
        }
    }

    public File a(String str, String str2) {
        File file = new File(g2.d(), h);
        if (!file.exists()) {
            file.mkdir();
        }
        StringBuilder sbS = YU.a.s(str);
        sbS.append(j5.c(str2));
        return new File(file, sbS.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[Catch: Exception -> 0x004a, PHI: r9
  0x0046: PHI (r9v4 java.nio.channels.FileChannel) = (r9v3 java.nio.channels.FileChannel), (r9v9 java.nio.channels.FileChannel) binds: [B:33:0x0089, B:9:0x0044] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #5 {Exception -> 0x004a, blocks: (B:8:0x0041, B:10:0x0046, B:32:0x0086), top: B:52:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3 A[Catch: Exception -> 0x009e, TRY_LEAVE, TryCatch #1 {Exception -> 0x009e, blocks: (B:40:0x009a, B:44:0x00a3), top: B:48:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(android.net.Uri r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r1 = "Can not create the media file + "
            java.io.File r2 = r10.a(r12, r13)
            r3 = 0
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            r4 = 29
            if (r0 < r4) goto L6c
            com.medallia.digital.mobilesdk.i4 r12 = com.medallia.digital.mobilesdk.i4.c()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            android.content.Context r12 = r12.b()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            android.content.ContentResolver r12 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            java.lang.String r13 = "r"
            android.os.ParcelFileDescriptor r11 = r12.openFileDescriptor(r11, r13)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            java.io.FileDescriptor r11 = r11.getFileDescriptor()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            java.nio.channels.FileChannel r4 = r12.getChannel()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L60
            r11.<init>(r2)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L60
            java.nio.channels.FileChannel r9 = r11.getChannel()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L60
            long r7 = r4.size()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L58
            r5 = 0
            r4.transferTo(r5, r7, r9)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L58
            r4.close()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L58
            r4.close()     // Catch: java.lang.Exception -> L4a
            if (r9 == 0) goto L8c
        L46:
            r9.close()     // Catch: java.lang.Exception -> L4a
            goto L8c
        L4a:
            r0 = move-exception
            r11 = r0
            java.lang.String r11 = r11.getMessage()
            com.medallia.digital.mobilesdk.a4.c(r11)
            goto L8c
        L54:
            r0 = move-exception
            r11 = r0
        L56:
            r3 = r4
            goto L98
        L58:
            r0 = move-exception
            r11 = r0
        L5a:
            r3 = r4
            goto L71
        L5c:
            r0 = move-exception
            r11 = r0
            r9 = r3
            goto L56
        L60:
            r0 = move-exception
            r11 = r0
            r9 = r3
            goto L5a
        L64:
            r0 = move-exception
            r11 = r0
            r9 = r3
            goto L98
        L68:
            r0 = move-exception
            r11 = r0
            r9 = r3
            goto L71
        L6c:
            java.lang.String r11 = r10.b(r11, r12, r13)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            return r11
        L71:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r12.<init>(r1)     // Catch: java.lang.Throwable -> L96
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L96
            r12.append(r11)     // Catch: java.lang.Throwable -> L96
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L96
            com.medallia.digital.mobilesdk.a4.c(r11)     // Catch: java.lang.Throwable -> L96
            if (r3 == 0) goto L89
            r3.close()     // Catch: java.lang.Exception -> L4a
        L89:
            if (r9 == 0) goto L8c
            goto L46
        L8c:
            java.lang.String r11 = "File Saved to internal storage"
            com.medallia.digital.mobilesdk.a4.b(r11)
            java.lang.String r11 = r2.getAbsolutePath()
            return r11
        L96:
            r0 = move-exception
            r11 = r0
        L98:
            if (r3 == 0) goto La1
            r3.close()     // Catch: java.lang.Exception -> L9e
            goto La1
        L9e:
            r0 = move-exception
            r12 = r0
            goto La7
        La1:
            if (r9 == 0) goto Lae
            r9.close()     // Catch: java.lang.Exception -> L9e
            goto Lae
        La7:
            java.lang.String r12 = r12.getMessage()
            com.medallia.digital.mobilesdk.a4.c(r12)
        Lae:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.c5.a(android.net.Uri, java.lang.String, java.lang.String):java.lang.String");
    }

    public void a() {
        ProgressDialog progressDialog = this.c;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.c = null;
        }
    }

    public void a(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setDataAndType(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, i);
            activity.startActivityForResult(intent, 3);
        } catch (Exception e2) {
            a4.c(YU.a.f(e2, new StringBuilder("Upload Media from gallery Error + ")));
        }
    }

    public void a(Activity activity, int i2) {
        try {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.durationLimit", i2);
            activity.startActivityForResult(intent, 2);
        } catch (Exception e2) {
            a4.c(YU.a.f(e2, new StringBuilder("Capture Video Error + ")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.medallia.digital.mobilesdk.z4 r24, com.medallia.digital.mobilesdk.a5<com.medallia.digital.mobilesdk.z4> r25, com.medallia.digital.mobilesdk.j2 r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.c5.a(com.medallia.digital.mobilesdk.z4, com.medallia.digital.mobilesdk.a5, com.medallia.digital.mobilesdk.j2, boolean):void");
    }

    public void a(String str) {
        try {
            g2.c(str);
            d();
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
    }

    public boolean a(Uri uri, int i2) {
        try {
            i5 i5Var = new i5();
            try {
                i5Var.setDataSource(i4.c().b(), uri);
                boolean z = ((int) TimeUnit.MILLISECONDS.toSeconds(Long.parseLong(i5Var.extractMetadata(9)))) + (-5) > i2;
                i5Var.close();
                return z;
            } finally {
            }
        } catch (Exception e2) {
            a4.c(e2.getMessage());
            return true;
        }
    }

    public boolean a(Uri uri, ArrayList<String> arrayList) {
        ContentResolver contentResolver = i4.c().b().getContentResolver();
        if (arrayList != null) {
            try {
            } catch (Exception unused) {
                a4.e("Validate video format failed.");
            }
            if (!arrayList.isEmpty()) {
                FileDescriptor fileDescriptor = contentResolver.openFileDescriptor(uri, "r").getFileDescriptor();
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(fileDescriptor);
                int trackCount = mediaExtractor.getTrackCount();
                for (int i2 = 0; i2 < trackCount; i2++) {
                    if (arrayList.contains(mediaExtractor.getTrackFormat(i2).getString("mime"))) {
                        a4.e("video format doesn't support");
                        return false;
                    }
                }
                return true;
            }
        }
        a4.e("unSupportedVideoFormats list is null");
        return true;
    }
}
