package androidx.compose.ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FocusInvalidationManager {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f1746a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public final MutableScatterSet e;
    public final MutableScatterSet f;
    public boolean g;

    public FocusInvalidationManager(Function1 function1, Function0 function0, Function0 function02, Function0 function03) {
        this.f1746a = function1;
        this.b = function0;
        this.c = function02;
        this.d = function03;
        int i = ScatterSetKt.f701a;
        this.e = new MutableScatterSet();
        this.f = new MutableScatterSet();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.focus.FocusInvalidationManager r24) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusInvalidationManager.a(androidx.compose.ui.focus.FocusInvalidationManager):void");
    }
}
