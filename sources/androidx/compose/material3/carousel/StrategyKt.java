package androidx.compose.material3.carousel;

import androidx.collection.FloatListKt;
import androidx.collection.MutableFloatList;
import androidx.collection.internal.RuntimeHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class StrategyKt {
    public static final MutableFloatList a(float f, List list, boolean z) {
        float f2;
        int i = FloatListKt.f672a;
        MutableFloatList mutableFloatList = new MutableFloatList(1);
        mutableFloatList.a(BitmapDescriptorFactory.HUE_RED);
        if (f != BitmapDescriptorFactory.HUE_RED && !list.isEmpty()) {
            IntRange intRangeO = RangesKt.o(1, list.size());
            ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeO, 10));
            IntProgressionIterator it = intRangeO.iterator();
            while (it.f) {
                int iNextInt = it.nextInt();
                int i2 = iNextInt - 1;
                KeylineList keylineList = (KeylineList) list.get(i2);
                KeylineList keylineList2 = (KeylineList) list.get(iNextInt);
                float f3 = (z ? ((Keyline) CollectionsKt.D(keylineList2)).c - ((Keyline) CollectionsKt.D(keylineList)).c : ((Keyline) CollectionsKt.O(keylineList)).c - ((Keyline) CollectionsKt.O(keylineList2)).c) / f;
                if (iNextInt == CollectionsKt.I(list)) {
                    f2 = 1.0f;
                } else {
                    if (i2 < 0 || i2 >= mutableFloatList.b) {
                        RuntimeHelpersKt.c("Index must be between 0 and size");
                        throw null;
                    }
                    f2 = mutableFloatList.f671a[i2] + f3;
                }
                mutableFloatList.a(f2);
                arrayList.add(Boolean.TRUE);
            }
        }
        return mutableFloatList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public static final KeylineList b(final KeylineList keylineList, float f, float f2, float f3, Keyline keyline, int i) {
        ArrayList arrayList = new ArrayList(keylineList.d.size());
        int size = keylineList.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            Keyline keyline2 = keylineList.get(i2);
            if (!keyline2.e) {
                arrayList.add(keyline2);
            }
        }
        final float size2 = f3 / arrayList.size();
        float f4 = (keyline.b - (size2 / 2.0f)) + f3;
        Function1<KeylineListScope, Unit> function1 = new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.StrategyKt$createShiftedKeylineListForContentPadding$newKeylines$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KeylineListScope keylineListScope = (KeylineListScope) obj;
                KeylineList keylineList2 = keylineList;
                int size3 = keylineList2.d.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Keyline keyline3 = keylineList2.get(i3);
                    keylineListScope.a(keyline3.f1538a - Math.abs(size2), keyline3.e);
                }
                return Unit.f24250a;
            }
        };
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        function1.invoke(keylineListScopeImpl);
        ArrayList arrayListB = KeylineListScopeImpl.b(i, f4, keylineListScopeImpl.f1539a, keylineListScopeImpl.c(), keylineListScopeImpl.b, f, f2, keylineListScopeImpl.c);
        KeylineList keylineList2 = new KeylineList(arrayListB);
        ArrayList arrayList2 = new ArrayList(arrayListB.size());
        int size3 = arrayListB.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Keyline keyline3 = keylineList2.get(i3);
            arrayList2.add(new Keyline(keyline3.f1538a, keyline3.b, keylineList.get(i3).c, keyline3.d, keyline3.e, keyline3.f, keyline3.g));
        }
        return new KeylineList(arrayList2);
    }

    public static final KeylineList c(final KeylineList keylineList, final int i, final int i2, float f, float f2) {
        int i3 = i > i2 ? 1 : -1;
        float f3 = ((keylineList.get(i).f1538a - keylineList.get(i).g) + f2) * i3;
        int i4 = keylineList.e;
        int i5 = i4 + i3;
        float f4 = keylineList.get(i4).b + f3;
        Function1<KeylineListScope, Unit> function1 = new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.StrategyKt$moveKeylineAndCreateShiftedKeylineList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KeylineListScope keylineListScope = (KeylineListScope) obj;
                ArrayList arrayListJ0 = CollectionsKt.J0(keylineList);
                int i6 = i;
                Keyline keyline = (Keyline) arrayListJ0.get(i6);
                arrayListJ0.remove(i6);
                arrayListJ0.add(i2, keyline);
                int size = arrayListJ0.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Keyline keyline2 = (Keyline) arrayListJ0.get(i7);
                    keylineListScope.a(keyline2.f1538a, keyline2.e);
                }
                return Unit.f24250a;
            }
        };
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        function1.invoke(keylineListScopeImpl);
        return new KeylineList(KeylineListScopeImpl.b(i5, f4, keylineListScopeImpl.f1539a, keylineListScopeImpl.c(), keylineListScopeImpl.b, f, f2, keylineListScopeImpl.c));
    }
}
