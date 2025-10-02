package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.d7;

/* loaded from: classes.dex */
class j8 {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16557a;

        static {
            int[] iArr = new int[b.values().length];
            f16557a = iArr;
            try {
                iArr[b.CONFIGURATION_UUID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16557a[b.OCQ_UUID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16557a[b.C_UUID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        CONFIGURATION_UUID,
        OCQ_UUID,
        C_UUID
    }

    private static String a(String str) {
        try {
            if (t0.c().a().getSdkConfiguration().getMedalliaDigitalClientConfig().getOcqCUuidUrlPrefix() != null) {
                return t0.c().a().getSdkConfiguration().getMedalliaDigitalClientConfig().getOcqCUuidUrlPrefix().concat(str);
            }
            return null;
        } catch (Exception unused) {
            a4.c("Cannot get ocqCuuidUrlPrefix from Configuration");
            return null;
        }
    }

    public static String b(b bVar) {
        d7.a aVarD = d(bVar);
        if (aVarD != null) {
            return d7.b().a(aVarD, (String) null);
        }
        return null;
    }

    public static String c(b bVar) {
        d7.a aVarE = e(bVar);
        if (aVarE != null) {
            return d7.b().a(aVarE, (String) null);
        }
        return null;
    }

    private static d7.a d(b bVar) {
        int i = a.f16557a[bVar.ordinal()];
        if (i == 1) {
            return d7.a.UUID;
        }
        if (i == 2) {
            return d7.a.OCQ_UUID;
        }
        if (i == 3) {
            return d7.a.C_UUID;
        }
        a4.b("couldn't find UUID Key for: " + bVar);
        return null;
    }

    private static d7.a e(b bVar) {
        if (bVar != null) {
            int i = a.f16557a[bVar.ordinal()];
            if (i == 1 || i == 2) {
                return d7.a.UUID_URL;
            }
            if (i == 3) {
                return d7.a.OCQ_UUID_URL;
            }
        }
        StringBuilder sb = new StringBuilder("couldn't find UUID Url Key for: ");
        sb.append(bVar != null ? bVar.toString() : "null");
        a4.b(sb.toString());
        return null;
    }

    public static void a(b bVar) {
        d7.a aVarD = d(bVar);
        d7.a aVarE = e(bVar);
        if (aVarD != null) {
            d7.b().b(aVarD, (String) null);
        }
        if (aVarE != null) {
            d7.b().b(aVarE, (String) null);
        }
    }

    public static void b(b bVar, String str) {
        d7.a aVarD = d(bVar);
        if (aVarD != null) {
            d7.b().b(aVarD, str);
        }
    }

    public static void c(b bVar, String str) {
        d7.a aVarE = e(bVar);
        if (aVarE != null) {
            if (b.C_UUID.equals(bVar)) {
                str = a(str);
            }
            d7.b().b(aVarE, str);
        }
    }

    public static boolean a(b bVar, String str) {
        if (str == null) {
            return false;
        }
        String strB = b(bVar);
        if (strB != null && strB.equals(str)) {
            a4.b("Uuid is equal -> using local " + bVar.toString());
            return true;
        }
        StringBuilder sb = new StringBuilder("New UUID is not equal to previous using remote ");
        sb.append(bVar.toString());
        a4.e(sb.toString());
        return false;
    }
}
