package com.scandit.datacapture.core;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class E1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f18310a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(ViewGroup viewGroup) {
        super(0);
        this.f18310a = viewGroup;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewGroup viewGroup = this.f18310a;
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sc_hint_view, viewGroup, false);
        Intrinsics.g(viewInflate, "from(context).inflate(layout, this, attachToRoot)");
        TextView textView = (TextView) viewInflate;
        this.f18310a.addView(textView);
        return textView;
    }
}
