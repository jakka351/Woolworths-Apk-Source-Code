package com.scandit.datacapture.core.internal.sdk.ui.hint;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.f;
import com.scandit.datacapture.core.C1011g3;
import com.scandit.datacapture.core.Q4;
import com.scandit.datacapture.core.U2;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint;
import com.scandit.datacapture.core.internal.module.ui.NativePlatformHintPresenter;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHint;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0007J\u001d\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000eR/\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2Impl;", "Landroid/widget/RelativeLayout;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/HintHolderV2;", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "toast", "", "showToast-sNLnd7M", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;)V", "showToast", "hideToast-sNLnd7M", "hideToast", "Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "guidance", "showGuidance-xQ0zqIA", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;)V", "showGuidance", "hideGuidance-xQ0zqIA", "hideGuidance", "Lcom/scandit/datacapture/core/common/geometry/Rect;", "<set-?>", "a", "Lkotlin/properties/ReadWriteProperty;", "getViewFinderRect", "()Lcom/scandit/datacapture/core/common/geometry/Rect;", "setViewFinderRect", "(Lcom/scandit/datacapture/core/common/geometry/Rect;)V", "viewFinderRect", "Lcom/scandit/datacapture/core/internal/module/ui/NativePlatformHintPresenter;", "b", "Lcom/scandit/datacapture/core/internal/module/ui/NativePlatformHintPresenter;", "getPlatformHintPresenter", "()Lcom/scandit/datacapture/core/internal/module/ui/NativePlatformHintPresenter;", "platformHintPresenter", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "com/scandit/datacapture/core/internal/sdk/ui/hint/a", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class HintHolderV2Impl extends RelativeLayout implements HintHolderV2 {

    @Deprecated
    public static final int POST_OPERATION_ID = 1;
    static final /* synthetic */ KProperty[] g;

    /* renamed from: a, reason: collision with root package name */
    private final HintHolderV2Impl$special$$inlined$distinctObservable$1 f18727a;
    private final Q4 b;
    private final LinkedHashMap c;
    private final LinkedHashMap d;
    private final LinkedList e;
    private final Runnable f;

    static {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        g = new KProperty[]{reflectionFactory.e(new MutablePropertyReference1Impl(reflectionFactory.b(HintHolderV2Impl.class), "viewFinderRect", "getViewFinderRect()Lcom/scandit/datacapture/core/common/geometry/Rect;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2Impl$special$$inlined$distinctObservable$1] */
    public HintHolderV2Impl(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        final Object obj = null;
        this.f18727a = new ObservableProperty<Rect>(obj) { // from class: com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2Impl$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Rect oldValue, Rect newValue) {
                Intrinsics.h(property, "property");
                if (Intrinsics.c(oldValue, newValue)) {
                    return;
                }
                HintHolderV2Impl hintHolderV2Impl = this;
                HintHolderV2Impl.access$updateAnchoring(hintHolderV2Impl, hintHolderV2Impl.getViewFinderRect());
            }
        };
        this.b = new Q4(this);
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedList();
        this.f = new f(this, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(HintHolderV2Impl this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.a();
    }

    public static final void access$updateAnchoring(HintHolderV2Impl hintHolderV2Impl, Rect rect) {
        hintHolderV2Impl.getClass();
        ViewExtensionsKt.runOnMainThread(hintHolderV2Impl, new d(hintHolderV2Impl, rect));
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    @NotNull
    public NativePlatformHintPresenter getPlatformHintPresenter() {
        return this.b;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    @Nullable
    public Rect getViewFinderRect() {
        return getValue(this, g[0]);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    /* renamed from: hideGuidance-xQ0zqIA */
    public void mo317hideGuidancexQ0zqIA(@NotNull NativeGuidanceHint guidance) {
        Intrinsics.h(guidance, "guidance");
        a(new HintHolderV2Impl$Operation$HideGuidance(guidance, null));
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    /* renamed from: hideToast-sNLnd7M */
    public void mo318hideToastsNLnd7M(@NotNull NativeToastHint toast) {
        Intrinsics.h(toast, "toast");
        a(new HintHolderV2Impl$Operation$HideToast(toast, null));
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    public void setViewFinderRect(@Nullable Rect rect) {
        setValue(this, g[0], rect);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    /* renamed from: showGuidance-xQ0zqIA */
    public void mo319showGuidancexQ0zqIA(@NotNull NativeGuidanceHint guidance) {
        Intrinsics.h(guidance, "guidance");
        a(new HintHolderV2Impl$Operation$ShowGuidance(guidance, null));
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2
    /* renamed from: showToast-sNLnd7M */
    public void mo320showToastsNLnd7M(@NotNull NativeToastHint toast) {
        Intrinsics.h(toast, "toast");
        a(new HintHolderV2Impl$Operation$ShowToast(toast, null));
    }

    private final void a(NativeToastHint nativeToastHint) {
        LinkedHashMap linkedHashMap = this.c;
        ToastHint toastHintM327boximpl = ToastHint.m327boximpl(nativeToastHint);
        Object obj = linkedHashMap.get(toastHintM327boximpl);
        Object obj2 = obj;
        if (obj == null) {
            Context context = getContext();
            Intrinsics.g(context, "context");
            C1011g3 c1011g3 = new C1011g3(context);
            addView(c1011g3);
            linkedHashMap.put(toastHintM327boximpl, c1011g3);
            obj2 = c1011g3;
        }
        C1011g3 c1011g32 = (C1011g3) obj2;
        c1011g32.a(ToastHint.m334getTextimpl(nativeToastHint));
        c1011g32.b(ToastHint.m333getHintStyleimpl(nativeToastHint), getViewFinderRect());
        U2.a(c1011g32, ToastHint.m333getHintStyleimpl(nativeToastHint).isAnimatedIntoView());
    }

    private final void a(NativeGuidanceHint nativeGuidanceHint) {
        Integer num;
        LinkedHashMap linkedHashMap = this.d;
        GuidanceHint guidanceHintM306boximpl = GuidanceHint.m306boximpl(nativeGuidanceHint);
        Object obj = linkedHashMap.get(guidanceHintM306boximpl);
        Object obj2 = obj;
        if (obj == null) {
            Context context = getContext();
            Intrinsics.g(context, "context");
            C1011g3 c1011g3 = new C1011g3(context);
            Iterator it = this.c.values().iterator();
            if (it.hasNext()) {
                Integer numValueOf = Integer.valueOf(indexOfChild((C1011g3) it.next()));
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(indexOfChild((C1011g3) it.next()));
                    if (numValueOf.compareTo(numValueOf2) > 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            int iIntValue = num != null ? num.intValue() : 0;
            addView(c1011g3, iIntValue >= 0 ? iIntValue : 0);
            linkedHashMap.put(guidanceHintM306boximpl, c1011g3);
            obj2 = c1011g3;
        }
        C1011g3 c1011g32 = (C1011g3) obj2;
        c1011g32.a(GuidanceHint.m313getTextimpl(nativeGuidanceHint));
        c1011g32.b(GuidanceHint.m312getHintStyleimpl(nativeGuidanceHint), getViewFinderRect());
        U2.a(c1011g32, GuidanceHint.m312getHintStyleimpl(nativeGuidanceHint).isAnimatedIntoView());
    }

    private final void a(a aVar) {
        synchronized (this.e) {
            this.e.addLast(aVar);
        }
        Handler handler = getHandler();
        if (handler == null) {
            return;
        }
        if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            handler.removeMessages(1);
            a();
        } else {
            if (handler.hasMessages(1)) {
                return;
            }
            Message messageObtain = Message.obtain(handler, this.f);
            messageObtain.what = 1;
            handler.sendMessage(messageObtain);
        }
    }

    private final void a() {
        synchronized (this.e) {
            while (!this.e.isEmpty()) {
                try {
                    a aVar = (a) this.e.removeFirst();
                    if (aVar instanceof HintHolderV2Impl$Operation$ShowGuidance) {
                        a(((HintHolderV2Impl$Operation$ShowGuidance) aVar).getGuidance());
                    } else if (aVar instanceof HintHolderV2Impl$Operation$HideGuidance) {
                        NativeGuidanceHint guidance = ((HintHolderV2Impl$Operation$HideGuidance) aVar).getGuidance();
                        C1011g3 c1011g3 = (C1011g3) this.d.get(GuidanceHint.m306boximpl(guidance));
                        if (c1011g3 != null) {
                            U2.a(c1011g3, GuidanceHint.m312getHintStyleimpl(guidance).isAnimatedIntoView(), new b(this, c1011g3, guidance));
                        }
                    } else if (aVar instanceof HintHolderV2Impl$Operation$ShowToast) {
                        a(((HintHolderV2Impl$Operation$ShowToast) aVar).getToast());
                    } else if (aVar instanceof HintHolderV2Impl$Operation$HideToast) {
                        NativeToastHint toast = ((HintHolderV2Impl$Operation$HideToast) aVar).getToast();
                        C1011g3 c1011g32 = (C1011g3) this.c.get(ToastHint.m327boximpl(toast));
                        if (c1011g32 != null) {
                            U2.a(c1011g32, ToastHint.m333getHintStyleimpl(toast).isAnimatedIntoView(), new c(this, c1011g32, toast));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
