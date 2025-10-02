package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/runtime/saveable/SaverKt$Saver$1", "Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaverKt$Saver$1 implements Saver<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f1702a;
    public final /* synthetic */ Function1 b;

    public SaverKt$Saver$1(Function1 function1, Function2 function2) {
        this.f1702a = function2;
        this.b = function1;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object a(SaverScope saverScope, Object obj) {
        return this.f1702a.invoke(saverScope, obj);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object b(Object obj) {
        return this.b.invoke(obj);
    }
}
