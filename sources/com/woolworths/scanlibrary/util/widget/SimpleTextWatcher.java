package com.woolworths.scanlibrary.util.widget;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/SimpleTextWatcher;", "Landroid/text/TextWatcher;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class SimpleTextWatcher implements TextWatcher {
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Intrinsics.h(editable, "editable");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.h(charSequence, "charSequence");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.h(charSequence, "charSequence");
    }
}
