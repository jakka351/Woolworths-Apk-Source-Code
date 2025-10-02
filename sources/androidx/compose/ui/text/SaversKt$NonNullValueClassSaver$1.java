package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/text/SaversKt$NonNullValueClassSaver$1", "Landroidx/compose/ui/text/NonNullValueClassSaver;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SaversKt$NonNullValueClassSaver$1 implements NonNullValueClassSaver<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lambda f2056a;
    public final /* synthetic */ Lambda b;

    /* JADX WARN: Multi-variable type inference failed */
    public SaversKt$NonNullValueClassSaver$1(Function1 function1, Function2 function2) {
        this.f2056a = (Lambda) function2;
        this.b = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.runtime.saveable.Saver
    public final Object a(SaverScope saverScope, Object obj) {
        return this.f2056a.invoke(saverScope, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.runtime.saveable.Saver
    public final Object b(Object obj) {
        return this.b.invoke(obj);
    }
}
