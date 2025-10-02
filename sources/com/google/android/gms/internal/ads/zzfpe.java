package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class zzfpe {
    public static boolean zza(zzaxq zzaxqVar) {
        int iOrdinal = zzaxqVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final zzaxq zzb(Context context, zzfoh zzfohVar) {
        zzaxq zzaxqVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzgms(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (zzfohVar != null) {
                    zzfohVar.zze(5017, "No .so");
                } else {
                    zzfohVar = null;
                }
                zzaxqVar = zzaxq.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e) {
                    zzc(null, e.toString(), context, zzfohVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzc(bArr, null, context, zzfohVar);
                        zzaxqVar = zzaxq.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            zzaxqVar = zzaxq.X86;
                        } else if (s == 40) {
                            zzaxqVar = zzaxq.ARM7;
                        } else if (s == 62) {
                            zzaxqVar = zzaxq.X86_64;
                        } else if (s == 183) {
                            zzaxqVar = zzaxq.ARM64;
                        } else if (s != 243) {
                            zzc(bArr, null, context, zzfohVar);
                            zzaxqVar = zzaxq.UNSUPPORTED;
                        } else {
                            zzaxqVar = zzaxq.RISCV64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzaxqVar = zzaxq.UNSUPPORTED;
                }
            }
        } else {
            if (zzfohVar != null) {
                zzfohVar.zze(5017, "No lib/");
            } else {
                zzfohVar = null;
            }
            zzaxqVar = zzaxq.UNKNOWN;
        }
        if (zzaxqVar == zzaxq.UNKNOWN) {
            String strZzd = zzd(context, zzfohVar);
            if (TextUtils.isEmpty(strZzd)) {
                zzc(null, "Empty dev arch", context, zzfohVar);
                zzaxqVar = zzaxq.UNSUPPORTED;
            } else if (strZzd.equalsIgnoreCase("i686") || strZzd.equalsIgnoreCase("x86")) {
                zzaxqVar = zzaxq.X86;
            } else if (strZzd.equalsIgnoreCase("x86_64")) {
                zzaxqVar = zzaxq.X86_64;
            } else if (strZzd.equalsIgnoreCase("arm64-v8a")) {
                zzaxqVar = zzaxq.ARM64;
            } else if (strZzd.equalsIgnoreCase("armeabi-v7a") || strZzd.equalsIgnoreCase("armv71")) {
                zzaxqVar = zzaxq.ARM7;
            } else if (strZzd.equalsIgnoreCase("riscv64")) {
                zzaxqVar = zzaxq.RISCV64;
            } else {
                zzc(null, strZzd, context, zzfohVar);
                zzaxqVar = zzaxq.UNSUPPORTED;
            }
        }
        if (zzfohVar != null) {
            zzfohVar.zze(5018, zzaxqVar.name());
        }
        return zzaxqVar;
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfoh zzfohVar) {
        if (zzfohVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzghr.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            androidx.compose.ui.input.pointer.a.w(sb, "dbg:", str, ";");
        }
        zzfohVar.zze(4007, sb.toString());
    }

    private static final String zzd(Context context, zzfoh zzfohVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzghr.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e) {
            if (zzfohVar != null) {
                zzfohVar.zzc(2024, 0L, e);
            }
        } catch (NoSuchFieldException e2) {
            if (zzfohVar != null) {
                zzfohVar.zzc(2024, 0L, e2);
            }
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }
}
