package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DatePickerKt$updateDisplayedMonth$3<T> implements FlowCollector {
    public final /* synthetic */ LazyListState d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ CalendarModel f;
    public final /* synthetic */ IntRange g;

    public DatePickerKt$updateDisplayedMonth$3(LazyListState lazyListState, Function1 function1, CalendarModel calendarModel, IntRange intRange) {
        this.d = lazyListState;
        this.e = function1;
        this.f = calendarModel;
        this.g = intRange;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ((Number) obj).intValue();
        LazyListState lazyListState = this.d;
        int iH = lazyListState.h() / 12;
        int iH2 = (lazyListState.h() % 12) + 1;
        this.e.invoke(new Long(this.f.e(this.g.d + iH, iH2).e));
        return Unit.f24250a;
    }
}
