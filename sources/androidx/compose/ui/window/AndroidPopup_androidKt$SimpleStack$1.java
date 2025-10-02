package androidx.compose.ui.window;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$SimpleStack$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidPopup_androidKt$SimpleStack$1 f2218a = new AndroidPopup_androidKt$SimpleStack$1();

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Unit.f24250a;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return measureScope.L0(0, 0, EmptyMap.d, AnonymousClass1.h);
        }
        if (size == 1) {
            final Placeable placeableC0 = ((Measurable) list.get(0)).c0(j);
            return measureScope.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Placeable.PlacementScope.h((Placeable.PlacementScope) obj, placeableC0, 0, 0);
                    return Unit.f24250a;
                }
            });
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            Placeable placeableC02 = ((Measurable) list.get(i)).c0(j);
            iMax = Math.max(iMax, placeableC02.d);
            iMax2 = Math.max(iMax2, placeableC02.e);
            arrayList.add(placeableC02);
        }
        return measureScope.L0(iMax, iMax2, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                ArrayList arrayList2 = arrayList;
                int I = CollectionsKt.I(arrayList2);
                if (I >= 0) {
                    int i2 = 0;
                    while (true) {
                        Placeable.PlacementScope.h(placementScope, (Placeable) arrayList2.get(i2), 0, 0);
                        if (i2 == I) {
                            break;
                        }
                        i2++;
                    }
                }
                return Unit.f24250a;
            }
        });
    }
}
