package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/text/input/internal/StatelessInputConnection$commitContentDelegateInputConnection$1", "Landroidx/core/view/inputmethod/InputConnectionCompat$OnCommitContentListener;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StatelessInputConnection$commitContentDelegateInputConnection$1 implements InputConnectionCompat.OnCommitContentListener {
    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public final boolean a(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                inputContentInfoCompat.d();
                Object objE = inputContentInfoCompat.e();
                Intrinsics.f(objE, "null cannot be cast to non-null type android.os.Parcelable");
                Parcelable parcelable = (Parcelable) objE;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                e.toString();
                return false;
            }
        }
        new ClipData(inputContentInfoCompat.b(), new ClipData.Item(inputContentInfoCompat.a()));
        inputContentInfoCompat.b();
        inputContentInfoCompat.c();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        return false;
    }
}
