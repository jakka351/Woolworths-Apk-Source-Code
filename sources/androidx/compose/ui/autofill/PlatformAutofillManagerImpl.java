package androidx.compose.ui.autofill;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/autofill/PlatformAutofillManagerImpl;", "Landroidx/compose/ui/autofill/PlatformAutofillManager;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformAutofillManagerImpl implements PlatformAutofillManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.autofill.AutofillManager f1734a;

    public PlatformAutofillManagerImpl(android.view.autofill.AutofillManager autofillManager) {
        this.f1734a = autofillManager;
    }

    public final void a(View view, int i, boolean z) {
        AutofillApi27Helper.a(view, this.f1734a, i, z);
    }
}
