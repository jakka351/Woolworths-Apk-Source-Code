package com.medallia.digital.mobilesdk;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.medallia.digital.mobilesdk.d7;

/* loaded from: classes6.dex */
class v7 {

    /* renamed from: a, reason: collision with root package name */
    private static v7 f16748a;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16749a;

        static {
            int[] iArr = new int[MDAppearanceMode.values().length];
            f16749a = iArr;
            try {
                iArr[MDAppearanceMode.dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16749a[MDAppearanceMode.light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static v7 c() {
        if (f16748a == null) {
            f16748a = new v7();
        }
        return f16748a;
    }

    public int a(MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
        if (mDAppearanceMode != null && mDAppearanceMode != MDAppearanceMode.unknown) {
            int i = a.f16749a[mDAppearanceMode.ordinal()];
            if (i == 1) {
                return R.style.MedalliaInvitationDarkDialog;
            }
            if (i == 2) {
                return R.style.MedalliaInvitationLightDialog;
            }
        } else if (mDAppearanceMode2 != null) {
            int i2 = a.f16749a[mDAppearanceMode2.ordinal()];
            if (i2 == 1) {
                return R.style.MedalliaInvitationDarkDialog;
            }
            if (i2 == 2) {
                return R.style.MedalliaInvitationLightDialog;
            }
        }
        return R.style.MedalliaInvitationLightDialog;
    }

    public MDAppearanceMode b() {
        String strA = d7.b().a(d7.a.CUSTOM_APPEARANCE, (String) null);
        if (strA != null) {
            try {
                if (!strA.isEmpty()) {
                    int i = a.f16749a[MDAppearanceMode.fromString(strA).ordinal()];
                    if (i == 1) {
                        return MDAppearanceMode.dark;
                    }
                    if (i == 2) {
                        return MDAppearanceMode.light;
                    }
                }
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
        return MDAppearanceMode.unknown;
    }

    public MDAppearanceMode d() {
        int i = i4.c().b().getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            a4.b("OS Appearance is: Light");
            return MDAppearanceMode.light;
        }
        if (i != 32) {
            return MDAppearanceMode.light;
        }
        a4.b("OS Appearance is: Dark");
        return MDAppearanceMode.dark;
    }

    public void e() {
        int i = i4.c().b().getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            a4.b("OS Appearance is: Light");
            d7.b().b(d7.a.OS_APPEARANCE, MDAppearanceMode.light.toString());
        } else if (i != 32) {
            return;
        }
        a4.b("OS Appearance is: Dark");
        d7.b().b(d7.a.OS_APPEARANCE, MDAppearanceMode.dark.toString());
    }

    public AlertDialog.Builder a(boolean z, String str, String str2, String str3, String str4, String str5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener, boolean z2, MDAppearanceMode mDAppearanceMode) {
        int iA = R.style.MedalliaInvitationLightDialog;
        if (z2 && mDAppearanceMode != null) {
            iA = a(mDAppearanceMode, null);
        } else if (z) {
            iA = a(b(), d());
        }
        return new z(i4.c().d(), iA, str, str2, str3, str4, str5, onClickListener, onClickListener2, onClickListener3, onCancelListener);
    }

    public t7 b(String str) {
        if (t0.c().a().getPropertyConfiguration() == null || t0.c().a().getPropertyConfiguration().getThemes() == null) {
            return null;
        }
        return t0.c().a().getPropertyConfiguration().getThemes().get(str);
    }

    public MDAppearanceMode a() {
        try {
            return (b() == MDAppearanceMode.unknown || b() == d()) ? d() : b();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return MDAppearanceMode.light;
        }
    }

    public void b(MDAppearanceMode mDAppearanceMode) {
        if (mDAppearanceMode == null) {
            d7.b().b(d7.a.CUSTOM_APPEARANCE, MDAppearanceMode.unknown.toString());
        } else {
            d7.b().b(d7.a.CUSTOM_APPEARANCE, mDAppearanceMode.toString());
        }
    }

    public v5 a(String str) {
        w5 w5VarA;
        try {
            t7 t7VarB = b(str);
            if (t7VarB == null) {
                return null;
            }
            int i = a.f16749a[a().ordinal()];
            if (i == 1) {
                w5VarA = t7VarB.a().a();
            } else {
                if (i != 2) {
                    return null;
                }
                w5VarA = t7VarB.a().b();
            }
            return w5VarA.a();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return null;
        }
    }

    public boolean a(MDAppearanceMode mDAppearanceMode) {
        MDAppearanceMode mDAppearanceModeB = b();
        if (mDAppearanceMode == null || mDAppearanceModeB == null) {
            return false;
        }
        return !mDAppearanceMode.toString().equals(mDAppearanceModeB.toString());
    }
}
