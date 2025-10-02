package androidx.compose.foundation.text.input.internal;

import android.credentials.ClearCredentialStateException;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.GetCredentialResponse;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.SelectRangeGesture;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ boolean C(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ ClearCredentialStateException c(Throwable th) {
        return (ClearCredentialStateException) th;
    }

    public static /* bridge */ /* synthetic */ CreateCredentialException d(Throwable th) {
        return (CreateCredentialException) th;
    }

    public static /* bridge */ /* synthetic */ CreateCredentialResponse e(Object obj) {
        return (CreateCredentialResponse) obj;
    }

    public static /* bridge */ /* synthetic */ GetCredentialResponse f(Object obj) {
        return (GetCredentialResponse) obj;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder l(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder m(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture n(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture o(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture p(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* synthetic */ void s() {
    }

    public static /* bridge */ /* synthetic */ void u(Object obj) {
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof DeleteGesture;
    }
}
