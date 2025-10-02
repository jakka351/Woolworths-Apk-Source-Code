package com.scandit.datacapture.barcode.hardwarebutton;

import android.annotation.TargetApi;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010B\u001f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/barcode/hardwarebutton/HardwareButtonKeyListener;", "Landroid/view/View$OnUnhandledKeyEventListener;", "Landroid/view/View;", "v", "Landroid/view/KeyEvent;", "event", "", "onUnhandledKeyEvent", "", "keyCode", "Lkotlin/Function0;", "", "onEvent", "startAction", "endAction", "<init>", "(ILkotlin/jvm/functions/Function0;II)V", "(ILkotlin/jvm/functions/Function0;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@TargetApi
@VisibleForTesting
/* loaded from: classes6.dex */
public final class HardwareButtonKeyListener implements View.OnUnhandledKeyEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final int f17698a;
    private final Function0 b;
    private final int c;
    private final int d;
    private boolean e;

    public HardwareButtonKeyListener(int i, @NotNull Function0<Unit> onEvent, int i2, int i3) {
        Intrinsics.h(onEvent, "onEvent");
        this.f17698a = i;
        this.b = onEvent;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.view.View.OnUnhandledKeyEventListener
    public boolean onUnhandledKeyEvent(@NotNull View v, @NotNull KeyEvent event) {
        Intrinsics.h(v, "v");
        Intrinsics.h(event, "event");
        if (event.getKeyCode() == this.f17698a && event.getAction() == this.c) {
            if (!this.e) {
                this.b.invoke();
                this.e = true;
            }
            return true;
        }
        if (event.getKeyCode() != this.f17698a || event.getAction() != this.d) {
            return false;
        }
        this.e = false;
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HardwareButtonKeyListener(int i, @NotNull Function0<Unit> onEvent) {
        this(i, onEvent, 0, 1);
        Intrinsics.h(onEvent, "onEvent");
    }
}
