package androidx.compose.material;

import androidx.compose.runtime.MutableIntState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1 extends Lambda implements Function0<Unit> {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newHeight", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ MutableIntState h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableIntState mutableIntState) {
            super(1);
            this.h = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            this.h.i(((Number) obj).intValue());
            return Unit.f24250a;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        throw null;
    }
}
