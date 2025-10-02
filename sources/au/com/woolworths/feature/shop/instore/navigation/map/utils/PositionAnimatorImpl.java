package au.com.woolworths.feature.shop.instore.navigation.map.utils;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.g;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientHeading;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientPosition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/utils/PositionAnimatorImpl;", "Lau/com/woolworths/feature/shop/instore/navigation/map/utils/PositionAnimator;", "PositionMapKeys", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PositionAnimatorImpl implements PositionAnimator {

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f7411a = StateFlowKt.a(null);
    public final MultipleValuesAnimator b;
    public final LinkedHashMap c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/utils/PositionAnimatorImpl$PositionMapKeys;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PositionMapKeys {
        public static final /* synthetic */ PositionMapKeys[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            PositionMapKeys[] positionMapKeysArr = {new PositionMapKeys("POSITION_X", 0), new PositionMapKeys("POSITION_Y", 1), new PositionMapKeys("HEADING_X", 2), new PositionMapKeys("HEADING_Y", 3), new PositionMapKeys("ACCURACY", 4)};
            d = positionMapKeysArr;
            e = EnumEntriesKt.a(positionMapKeysArr);
        }

        public static PositionMapKeys valueOf(String str) {
            return (PositionMapKeys) Enum.valueOf(PositionMapKeys.class, str);
        }

        public static PositionMapKeys[] values() {
            return (PositionMapKeys[]) d.clone();
        }
    }

    public PositionAnimatorImpl() {
        MultipleValuesAnimator multipleValuesAnimator = new MultipleValuesAnimator();
        this.b = multipleValuesAnimator;
        this.c = new LinkedHashMap();
        multipleValuesAnimator.l = new a(this, 0);
    }

    /* JADX WARN: Finally extract failed */
    @Override // au.com.woolworths.feature.shop.instore.navigation.map.utils.PositionAnimator
    public final void a(CloseableCoroutineScope closeableCoroutineScope, OriientPosition oriientPosition) {
        ReentrantLock reentrantLock;
        MultipleValuesAnimator multipleValuesAnimator = this.b;
        MutableStateFlow mutableStateFlow = this.f7411a;
        if (oriientPosition == null) {
            ArrayList arrayList = multipleValuesAnimator.d;
            reentrantLock = multipleValuesAnimator.i;
            reentrantLock.lock();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Animator) it.next()).cancel();
                }
                arrayList.clear();
                reentrantLock.unlock();
                mutableStateFlow.setValue(null);
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        OriientMetersCoordinate oriientMetersCoordinate = oriientPosition.f7345a;
        if (mutableStateFlow.getValue() == null) {
            mutableStateFlow.setValue(oriientPosition);
        }
        LinkedHashMap values = this.c;
        values.clear();
        values.put("POSITION_X", Float.valueOf((float) oriientMetersCoordinate.f7344a));
        values.put("POSITION_Y", Float.valueOf((float) oriientMetersCoordinate.b));
        OriientHeading oriientHeading = oriientPosition.b;
        values.put("HEADING_X", Float.valueOf((float) oriientHeading.f7340a));
        values.put("HEADING_Y", Float.valueOf((float) oriientHeading.b));
        values.put("ACCURACY", Float.valueOf((float) oriientPosition.d));
        LinkedHashMap linkedHashMap = multipleValuesAnimator.c;
        LinkedHashMap linkedHashMap2 = multipleValuesAnimator.f7410a;
        Intrinsics.h(values, "values");
        reentrantLock = multipleValuesAnimator.i;
        reentrantLock.lock();
        try {
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap2.putAll(values);
            }
            for (Map.Entry entry : values.entrySet()) {
                if (!linkedHashMap.containsKey(entry.getKey())) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    valueAnimatorOfFloat.addUpdateListener(new g(1, multipleValuesAnimator, entry));
                    linkedHashMap.put(entry.getKey(), valueAnimatorOfFloat);
                }
            }
            multipleValuesAnimator.b.putAll(values);
            if (!multipleValuesAnimator.j) {
                multipleValuesAnimator.a(closeableCoroutineScope);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.utils.PositionAnimator
    public final StateFlow getPosition() {
        return this.f7411a;
    }
}
