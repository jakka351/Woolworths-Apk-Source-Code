package androidx.compose.ui.layout;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@MeasureScopeMarker
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    default MeasureResult B1(final int i, final int i2, final Map map, final Function1 function1) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            InlineClassHelperKt.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i, i2, map, this, function1) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1

            /* renamed from: a, reason: collision with root package name */
            public final int f1887a;
            public final int b;
            public final Map c;
            public final /* synthetic */ int d;
            public final /* synthetic */ MeasureScope e;
            public final /* synthetic */ Function1 f;

            {
                this.d = i;
                this.e = this;
                this.f = function1;
                this.f1887a = i;
                this.b = i2;
                this.c = map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getHeight, reason: from getter */
            public final int getB() {
                return this.b;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getWidth, reason: from getter */
            public final int getF1887a() {
                return this.f1887a;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: o, reason: from getter */
            public final Map getC() {
                return this.c;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final Function1 p() {
                return null;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void q() {
                MeasureScope measureScope = this.e;
                boolean z = measureScope instanceof LookaheadCapablePlaceable;
                Function1 function12 = this.f;
                if (z) {
                    function12.invoke(((LookaheadCapablePlaceable) measureScope).l);
                } else {
                    function12.invoke(new SimplePlacementScope(this.d, measureScope.getLayoutDirection()));
                }
            }
        };
    }

    default MeasureResult L0(int i, int i2, Map map, Function1 function1) {
        return B1(i, i2, map, function1);
    }
}
