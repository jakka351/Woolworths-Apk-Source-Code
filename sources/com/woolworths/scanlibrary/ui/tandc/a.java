package com.woolworths.scanlibrary.ui.tandc;

import android.view.KeyEvent;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.MaterialCheckable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21347a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ a(KeyEvent.Callback callback, int i) {
        this.f21347a = i;
        this.b = callback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f21347a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                int i2 = TermsConditionsActivity.L;
                Intrinsics.h(compoundButton, "<unused var>");
                ((TermsConditionsActivity) callback).c5();
                break;
            case 1:
                int i3 = TermsConditionsActivity.L;
                Intrinsics.h(compoundButton, "<unused var>");
                ((TermsConditionsActivity) callback).c5();
                break;
            default:
                Chip chip = (Chip) callback;
                MaterialCheckable.OnCheckedChangeListener onCheckedChangeListener = chip.m;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.a(chip, z);
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = chip.l;
                if (onCheckedChangeListener2 != null) {
                    onCheckedChangeListener2.onCheckedChanged(compoundButton, z);
                    break;
                }
                break;
        }
    }
}
