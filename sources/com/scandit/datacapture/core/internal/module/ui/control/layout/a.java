package com.scandit.datacapture.core.internal.module.ui.control.layout;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.scandit.datacapture.core.C1126t1;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.ui.control.Control;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Control f18627a;
    final /* synthetic */ ControlLayout b;
    final /* synthetic */ Anchor c;
    final /* synthetic */ PointWithUnit d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Control control, ControlLayout controlLayout, Anchor anchor, PointWithUnit pointWithUnit) {
        super(0);
        this.f18627a = control;
        this.b = controlLayout;
        this.c = anchor;
        this.d = pointWithUnit;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        View view = this.f18627a.get_view();
        ((C1126t1) this.b.f18626a).a(view, this.c, this.d, new Size2(this.b.getWidth(), this.b.getHeight()));
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        this.b.addView(view, view.getLayoutParams());
        return Unit.f24250a;
    }
}
