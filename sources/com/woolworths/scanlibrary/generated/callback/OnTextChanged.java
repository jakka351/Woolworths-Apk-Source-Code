package com.woolworths.scanlibrary.generated.callback;

import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.scanlibrary.databinding.ActivityManualAddItemProcessBindingImpl;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class OnTextChanged implements TextViewBindingAdapter.OnTextChanged {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityManualAddItemProcessBindingImpl f21209a;

    public interface Listener {
    }

    public OnTextChanged(ActivityManualAddItemProcessBindingImpl activityManualAddItemProcessBindingImpl) {
        this.f21209a = activityManualAddItemProcessBindingImpl;
    }

    @Override // androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged
    public final void onTextChanged(CharSequence text, int i, int i2, int i3) {
        AddItemActivity addItemActivity = this.f21209a.L;
        if (addItemActivity != null) {
            Intrinsics.h(text, "text");
            addItemActivity.d5().B.setEnabled(text.length() > 0);
        }
    }
}
