package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0003ABCB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010$\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\rR\"\u0010,\u001a\u00020%8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020%8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\"\u00104\u001a\u00020%8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R$\u0010<\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "", "setPointsColor", "(I)V", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "setViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "setViewPager2", "(Landroidx/viewpager2/widget/ViewPager2;)V", "", "e", "Z", "getDotsClickable", "()Z", "setDotsClickable", "(Z)V", "dotsClickable", "value", "f", "I", "getDotsColor", "()I", "setDotsColor", "dotsColor", "", "g", "F", "getDotsSize", "()F", "setDotsSize", "(F)V", "dotsSize", "h", "getDotsCornerRadius", "setDotsCornerRadius", "dotsCornerRadius", "i", "getDotsSpacing", "setDotsSpacing", "dotsSpacing", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;", "j", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;", "getPager", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;", "setPager", "(Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;)V", "pager", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "getType", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "type", "Companion", "Pager", "Type", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public abstract class BaseDotsIndicator extends FrameLayout {
    public final ArrayList d;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean dotsClickable;

    /* renamed from: f, reason: from kotlin metadata */
    public int dotsColor;

    /* renamed from: g, reason: from kotlin metadata */
    public float dotsSize;

    /* renamed from: h, reason: from kotlin metadata */
    public float dotsCornerRadius;

    /* renamed from: i, reason: from kotlin metadata */
    public float dotsSpacing;

    /* renamed from: j, reason: from kotlin metadata */
    public Pager pager;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Companion;", "", "", "DEFAULT_POINT_COLOR", "I", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;", "", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    public interface Pager {
        int a();

        void b(int i);

        void c(OnPageChangeListenerHelper onPageChangeListenerHelper);

        void d();

        boolean e();

        int getCount();

        boolean isEmpty();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    public enum Type {
        DEFAULT(8.0f, R.styleable.b, 2, 4, 5, 3),
        SPRING(4.0f, R.styleable.f19117a, 1, 4, 5, 2),
        WORM(4.0f, R.styleable.c, 1, 3, 4, 2);

        public final float d;
        public final int[] e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;

        Type(float f, int[] iArr, int i, int i2, int i3, int i4) {
            this.d = f;
            this.e = iArr;
            this.f = i;
            this.g = i2;
            this.h = i3;
            this.i = i4;
        }
    }

    @JvmOverloads
    public BaseDotsIndicator(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    public abstract void a(int i);

    public abstract OnPageChangeListenerHelper b();

    public final float c(float f) {
        Context context = getContext();
        Intrinsics.g(context, "context");
        Resources resources = context.getResources();
        Intrinsics.g(resources, "context.resources");
        return resources.getDisplayMetrics().density * f;
    }

    public abstract void d(int i);

    public final void e() {
        if (this.pager == null) {
            return;
        }
        post(new Runnable() { // from class: com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$refreshDots$1
            @Override // java.lang.Runnable
            public final void run() {
                BaseDotsIndicator baseDotsIndicator = this.d;
                ArrayList arrayList = baseDotsIndicator.d;
                int size = arrayList.size();
                BaseDotsIndicator.Pager pager = baseDotsIndicator.pager;
                Intrinsics.e(pager);
                if (size < pager.getCount()) {
                    BaseDotsIndicator.Pager pager2 = baseDotsIndicator.pager;
                    Intrinsics.e(pager2);
                    int count = pager2.getCount() - arrayList.size();
                    for (int i = 0; i < count; i++) {
                        baseDotsIndicator.a(i);
                    }
                } else {
                    int size2 = arrayList.size();
                    BaseDotsIndicator.Pager pager3 = baseDotsIndicator.pager;
                    Intrinsics.e(pager3);
                    if (size2 > pager3.getCount()) {
                        int size3 = arrayList.size();
                        BaseDotsIndicator.Pager pager4 = baseDotsIndicator.pager;
                        Intrinsics.e(pager4);
                        int count2 = size3 - pager4.getCount();
                        for (int i2 = 0; i2 < count2; i2++) {
                            baseDotsIndicator.g();
                        }
                    }
                }
                baseDotsIndicator.f();
                BaseDotsIndicator.Pager pager5 = baseDotsIndicator.pager;
                Intrinsics.e(pager5);
                int iA = pager5.a();
                for (int i3 = 0; i3 < iA; i3++) {
                    Object obj = arrayList.get(i3);
                    Intrinsics.g(obj, "dots[i]");
                    View view = (View) obj;
                    view.getLayoutParams().width = (int) baseDotsIndicator.dotsSize;
                    view.requestLayout();
                }
                BaseDotsIndicator.Pager pager6 = baseDotsIndicator.pager;
                Intrinsics.e(pager6);
                if (pager6.e()) {
                    BaseDotsIndicator.Pager pager7 = baseDotsIndicator.pager;
                    Intrinsics.e(pager7);
                    pager7.d();
                    OnPageChangeListenerHelper onPageChangeListenerHelperB = baseDotsIndicator.b();
                    BaseDotsIndicator.Pager pager8 = baseDotsIndicator.pager;
                    Intrinsics.e(pager8);
                    pager8.c(onPageChangeListenerHelperB);
                    BaseDotsIndicator.Pager pager9 = baseDotsIndicator.pager;
                    Intrinsics.e(pager9);
                    onPageChangeListenerHelperB.b(BitmapDescriptorFactory.HUE_RED, pager9.a());
                }
            }
        });
    }

    public final void f() {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            d(i);
        }
    }

    public abstract void g();

    public final boolean getDotsClickable() {
        return this.dotsClickable;
    }

    public final int getDotsColor() {
        return this.dotsColor;
    }

    public final float getDotsCornerRadius() {
        return this.dotsCornerRadius;
    }

    public final float getDotsSize() {
        return this.dotsSize;
    }

    public final float getDotsSpacing() {
        return this.dotsSpacing;
    }

    @Nullable
    public final Pager getPager() {
        return this.pager;
    }

    @NotNull
    public abstract Type getType();

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getLayoutDirection() == 1) {
            setLayoutDirection(0);
            setRotation(180.0f);
            requestLayout();
        }
    }

    public final void setDotsClickable(boolean z) {
        this.dotsClickable = z;
    }

    public final void setDotsColor(int i) {
        this.dotsColor = i;
        f();
    }

    public final void setDotsCornerRadius(float f) {
        this.dotsCornerRadius = f;
    }

    public final void setDotsSize(float f) {
        this.dotsSize = f;
    }

    public final void setDotsSpacing(float f) {
        this.dotsSpacing = f;
    }

    public final void setPager(@Nullable Pager pager) {
        this.pager = pager;
    }

    @Deprecated
    public final void setPointsColor(int color) {
        setDotsColor(color);
        f();
    }

    public final void setViewPager(@NotNull final ViewPager viewPager) {
        Intrinsics.h(viewPager, "viewPager");
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("You have to set an adapter to the view pager before initializing the dots indicator !");
        }
        PagerAdapter adapter = viewPager.getAdapter();
        Intrinsics.e(adapter);
        adapter.d.registerObserver(new DataSetObserver() { // from class: com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.setViewPager.1
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super.onChanged();
                BaseDotsIndicator.this.e();
            }
        });
        this.pager = new Pager(this) { // from class: com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.setViewPager.2

            /* renamed from: a, reason: collision with root package name */
            public BaseDotsIndicator$setViewPager$2$addOnPageChangeListener$1 f19111a;

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final int a() {
                return viewPager.getCurrentItem();
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final void b(int i) throws Resources.NotFoundException {
                ViewPager viewPager2 = viewPager;
                viewPager2.y = false;
                viewPager2.w(i, 0, true, false);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.viewpager.widget.ViewPager$OnPageChangeListener, com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$setViewPager$2$addOnPageChangeListener$1] */
            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final void c(final OnPageChangeListenerHelper onPageChangeListenerHelper) {
                Intrinsics.h(onPageChangeListenerHelper, "onPageChangeListenerHelper");
                ?? r0 = new ViewPager.OnPageChangeListener() { // from class: com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$setViewPager$2$addOnPageChangeListener$1
                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void a(int i) {
                        Callback.r();
                        try {
                        } finally {
                            Callback.s();
                        }
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void b(int i) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void c(float f, int i, int i2) {
                        onPageChangeListenerHelper.b(f, i);
                    }
                };
                this.f19111a = r0;
                viewPager.b(r0);
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final void d() {
                ArrayList arrayList;
                BaseDotsIndicator$setViewPager$2$addOnPageChangeListener$1 baseDotsIndicator$setViewPager$2$addOnPageChangeListener$1 = this.f19111a;
                if (baseDotsIndicator$setViewPager$2$addOnPageChangeListener$1 == null || (arrayList = viewPager.U) == null) {
                    return;
                }
                arrayList.remove(baseDotsIndicator$setViewPager$2$addOnPageChangeListener$1);
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final boolean e() {
                PagerAdapter adapter2 = viewPager.getAdapter();
                Intrinsics.e(adapter2);
                return adapter2.g() > 0;
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final int getCount() {
                PagerAdapter adapter2 = viewPager.getAdapter();
                if (adapter2 != null) {
                    return adapter2.g();
                }
                return 0;
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final boolean isEmpty() {
                ViewPager viewPager2 = viewPager;
                if (viewPager2.getAdapter() == null) {
                    return false;
                }
                PagerAdapter adapter2 = viewPager2.getAdapter();
                Intrinsics.e(adapter2);
                return adapter2.g() == 0;
            }
        };
        e();
    }

    public final void setViewPager2(@NotNull final ViewPager2 viewPager2) {
        Intrinsics.h(viewPager2, "viewPager2");
        if (viewPager2.getAdapter() == null) {
            throw new IllegalStateException("You have to set an adapter to the view pager before initializing the dots indicator !");
        }
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        Intrinsics.e(adapter);
        adapter.D(new RecyclerView.AdapterDataObserver() { // from class: com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.setViewPager2.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void a() {
                BaseDotsIndicator.this.e();
            }
        });
        this.pager = new Pager(this) { // from class: com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.setViewPager2.2

            /* renamed from: a, reason: collision with root package name */
            public BaseDotsIndicator$setViewPager2$2$addOnPageChangeListener$1 f19114a;

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final int a() {
                return viewPager2.getCurrentItem();
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final void b(int i) {
                viewPager2.e(i, true);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback, com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$setViewPager2$2$addOnPageChangeListener$1] */
            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final void c(final OnPageChangeListenerHelper onPageChangeListenerHelper) {
                Intrinsics.h(onPageChangeListenerHelper, "onPageChangeListenerHelper");
                ?? r0 = new ViewPager2.OnPageChangeCallback() { // from class: com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$setViewPager2$2$addOnPageChangeListener$1
                    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                    public final void b(float f, int i, int i2) {
                        onPageChangeListenerHelper.b(f, i);
                    }
                };
                this.f19114a = r0;
                viewPager2.c(r0);
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final void d() {
                BaseDotsIndicator$setViewPager2$2$addOnPageChangeListener$1 baseDotsIndicator$setViewPager2$2$addOnPageChangeListener$1 = this.f19114a;
                if (baseDotsIndicator$setViewPager2$2$addOnPageChangeListener$1 != null) {
                    viewPager2.g(baseDotsIndicator$setViewPager2$2$addOnPageChangeListener$1);
                }
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final boolean e() {
                RecyclerView.Adapter adapter2 = viewPager2.getAdapter();
                Intrinsics.e(adapter2);
                return adapter2.i() > 0;
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final int getCount() {
                RecyclerView.Adapter adapter2 = viewPager2.getAdapter();
                if (adapter2 != null) {
                    return adapter2.i();
                }
                return 0;
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.Pager
            public final boolean isEmpty() {
                ViewPager2 viewPager22 = viewPager2;
                if (viewPager22.getAdapter() == null) {
                    return false;
                }
                RecyclerView.Adapter adapter2 = viewPager22.getAdapter();
                Intrinsics.e(adapter2);
                return adapter2.i() == 0;
            }
        };
        e();
    }

    @JvmOverloads
    public BaseDotsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ BaseDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseDotsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.d = new ArrayList();
        this.dotsClickable = true;
        this.dotsColor = -16711681;
        getType().getClass();
        float fC = c(16.0f);
        this.dotsSize = fC;
        this.dotsCornerRadius = fC / 2.0f;
        this.dotsSpacing = c(getType().d);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getType().e);
            Intrinsics.g(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…(attrs, type.styleableId)");
            setDotsColor(typedArrayObtainStyledAttributes.getColor(getType().f, -16711681));
            this.dotsSize = typedArrayObtainStyledAttributes.getDimension(getType().g, this.dotsSize);
            this.dotsCornerRadius = typedArrayObtainStyledAttributes.getDimension(getType().i, this.dotsCornerRadius);
            this.dotsSpacing = typedArrayObtainStyledAttributes.getDimension(getType().h, this.dotsSpacing);
            getType().getClass();
            this.dotsClickable = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
