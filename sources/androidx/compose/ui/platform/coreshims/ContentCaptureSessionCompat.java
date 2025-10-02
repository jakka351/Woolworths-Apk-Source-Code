package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.platform.l;

@RestrictTo
/* loaded from: classes.dex */
public class ContentCaptureSessionCompat {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1997a;
    public final View b;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api23Impl {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        public static ViewStructure b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        public static void c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
            contentCaptureSession.notifyViewTextChanged(autofillId, str);
        }

        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api34Impl {
    }

    public ContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        this.f1997a = contentCaptureSession;
        this.b = view;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.f(l.h(this.f1997a), this.b.getAutofillId(), new long[]{Long.MIN_VALUE});
        }
    }

    public final AutofillId b(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.a(l.h(this.f1997a), this.b.getAutofillId(), j);
        }
        return null;
    }

    public final ViewStructureCompat c(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ViewStructureCompat.i(Api29Impl.b(l.h(this.f1997a), autofillId, j));
        }
        return null;
    }

    public final void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.c(l.h(this.f1997a), viewStructure);
        }
    }

    public final void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.d(l.h(this.f1997a), autofillId);
        }
    }

    public final void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.e(l.h(this.f1997a), autofillId, str);
        }
    }
}
