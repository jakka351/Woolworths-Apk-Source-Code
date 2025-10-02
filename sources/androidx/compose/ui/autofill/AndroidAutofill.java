package androidx.compose.ui.autofill;

import android.view.autofill.AutofillId;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/Autofill;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidAutofill implements Autofill {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f1727a;
    public final AutofillTree b;
    public final android.view.autofill.AutofillManager c;
    public final AutofillId d;

    public AndroidAutofill(AndroidComposeView androidComposeView, AutofillTree autofillTree) {
        this.f1727a = androidComposeView;
        this.b = autofillTree;
        android.view.autofill.AutofillManager autofillManager = (android.view.autofill.AutofillManager) androidComposeView.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.c = autofillManager;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw b.w("Required value was null.");
        }
        this.d = autofillId;
    }
}
