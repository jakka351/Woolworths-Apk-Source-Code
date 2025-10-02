package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Landroidx/compose/ui/focus/FocusProperties;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FocusPropertiesImpl implements FocusProperties {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1748a = true;
    public final FocusRequester b;
    public final FocusRequester c;
    public final FocusRequester d;
    public final FocusRequester e;
    public final FocusRequester f;
    public final FocusRequester g;
    public final FocusRequester h;
    public final FocusRequester i;
    public Lambda j;
    public Lambda k;

    public FocusPropertiesImpl() {
        FocusRequester focusRequester = FocusRequester.b;
        this.b = focusRequester;
        this.c = focusRequester;
        this.d = focusRequester;
        this.e = focusRequester;
        this.f = focusRequester;
        this.g = focusRequester;
        this.h = focusRequester;
        this.i = focusRequester;
        this.j = FocusPropertiesImpl$onEnter$1.h;
        this.k = FocusPropertiesImpl$onExit$1.h;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final void a(boolean z) {
        this.f1748a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.focus.FocusProperties
    public final void b(Function1 function1) {
        this.j = (Lambda) function1;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* renamed from: c, reason: from getter */
    public final boolean getF1748a() {
        return this.f1748a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.focus.FocusProperties
    public final void d(Function1 function1) {
        this.k = (Lambda) function1;
    }
}
