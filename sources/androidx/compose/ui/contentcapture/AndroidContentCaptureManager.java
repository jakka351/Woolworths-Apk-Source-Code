package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.z;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "Landroidx/compose/ui/contentcapture/ContentCaptureManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/view/View$OnAttachStateChangeListener;", "Companion", "TranslateStatus", "ViewTranslationHelperMethods", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidContentCaptureManager implements ContentCaptureManager, DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public final AndroidComposeView d;
    public final Function0 e;
    public ContentCaptureSessionCompat f;
    public final ArrayList g = new ArrayList();
    public final long h = 100;
    public TranslateStatus i = TranslateStatus.d;
    public boolean j = true;
    public final BufferedChannel k = ChannelKt.a(1, 6, null);
    public final Handler l = new Handler(Looper.getMainLooper());
    public MutableIntObjectMap m;
    public long n;
    public final MutableIntObjectMap o;
    public SemanticsNodeCopy p;
    public boolean q;
    public final a r;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$Companion;", "", "", "VIEW_STRUCTURE_BUNDLE_KEY_ADDITIONAL_INDEX", "Ljava/lang/String;", "VIEW_STRUCTURE_BUNDLE_KEY_TIMESTAMP", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TranslateStatus {
        public static final TranslateStatus d;
        public static final TranslateStatus e;
        public static final /* synthetic */ TranslateStatus[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            TranslateStatus translateStatus = new TranslateStatus("SHOW_ORIGINAL", 0);
            d = translateStatus;
            TranslateStatus translateStatus2 = new TranslateStatus("SHOW_TRANSLATED", 1);
            e = translateStatus2;
            TranslateStatus[] translateStatusArr = {translateStatus, translateStatus2};
            f = translateStatusArr;
            g = EnumEntriesKt.a(translateStatusArr);
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) f.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @RequiresApi
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class ViewTranslationHelperMethods {
        public static void a(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            SemanticsNode semanticsNode;
            AccessibilityAction accessibilityAction;
            Function1 function1;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                long jKeyAt = longSparseArray.keyAt(i);
                ViewTranslationResponse viewTranslationResponseP = z.p(longSparseArray.get(jKeyAt));
                if (viewTranslationResponseP != null && (value = viewTranslationResponseP.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidContentCaptureManager.c().b((int) jKeyAt)) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.f1982a) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.d, SemanticsActions.k)) != null && (function1 = (Function1) accessibilityAction.b) != null) {
                }
            }
        }

        public static void b(AndroidContentCaptureManager androidContentCaptureManager, long[] jArr, Consumer consumer) {
            SemanticsNode semanticsNode;
            String strB;
            for (long j : jArr) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidContentCaptureManager.c().b((int) j);
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.f1982a) != null) {
                    z.D();
                    ViewTranslationRequest.Builder builderN = z.n(androidContentCaptureManager.d.getAutofillId(), semanticsNode.g);
                    List list = (List) SemanticsConfigurationKt.a(semanticsNode.d, SemanticsProperties.z);
                    if (list != null && (strB = ListUtilsKt.b(list, "\n", null, 62)) != null) {
                        builderN.setValue("android:text", TranslationRequestValue.forText(new AnnotatedString(strB)));
                        consumer.accept(builderN.build());
                    }
                }
            }
        }

        public static void c(final AndroidContentCaptureManager androidContentCaptureManager, final LongSparseArray longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (Intrinsics.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                a(androidContentCaptureManager, longSparseArray);
            } else {
                androidContentCaptureManager.d.post(new Runnable() { // from class: androidx.compose.ui.contentcapture.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.ViewTranslationHelperMethods.a(androidContentCaptureManager, longSparseArray);
                    }
                });
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ContentCaptureEventType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ContentCaptureEventType contentCaptureEventType = ContentCaptureEventType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.contentcapture.a] */
    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, Function0 function0) {
        this.d = androidComposeView;
        this.e = function0;
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f679a;
        Intrinsics.f(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.m = mutableIntObjectMap;
        this.o = new MutableIntObjectMap();
        SemanticsNode semanticsNodeA = androidComposeView.getSemanticsOwner().a();
        Intrinsics.f(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.p = new SemanticsNodeCopy(semanticsNodeA, mutableIntObjectMap);
        this.r = new Runnable() { // from class: androidx.compose.ui.contentcapture.a
            /* JADX WARN: Removed duplicated region for block: B:64:0x016e  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 746
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.a.run():void");
            }
        };
    }

    public static void j(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
        ViewTranslationHelperMethods.c(androidContentCaptureManager, longSparseArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0088 -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlinx.coroutines.channels.ChannelIterator r2 = r0.q
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = r0.p
            kotlin.ResultKt.b(r10)
        L2d:
            r10 = r2
            r2 = r5
            goto L4a
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            kotlinx.coroutines.channels.ChannelIterator r2 = r0.q
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = r0.p
            kotlin.ResultKt.b(r10)
            goto L5b
        L40:
            kotlin.ResultKt.b(r10)
            kotlinx.coroutines.channels.BufferedChannel r10 = r9.k
            kotlinx.coroutines.channels.ChannelIterator r10 = r10.iterator()
            r2 = r9
        L4a:
            r0.p = r2
            r0.q = r10
            r0.t = r4
            java.lang.Object r5 = r10.b(r0)
            if (r5 != r1) goto L57
            goto L8a
        L57:
            r8 = r2
            r2 = r10
            r10 = r5
            r5 = r8
        L5b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8b
            r2.next()
            boolean r10 = r5.d()
            if (r10 == 0) goto L6f
            r5.e()
        L6f:
            boolean r10 = r5.q
            if (r10 != 0) goto L7c
            r5.q = r4
            android.os.Handler r10 = r5.l
            androidx.compose.ui.contentcapture.a r6 = r5.r
            r10.post(r6)
        L7c:
            long r6 = r5.h
            r0.p = r5
            r0.q = r2
            r0.t = r3
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.b(r6, r0)
            if (r10 != r1) goto L2d
        L8a:
            return r1
        L8b:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(SemanticsNode semanticsNode, Function2 function2) {
        semanticsNode.getClass();
        List listH = SemanticsNode.h(4, semanticsNode);
        int size = listH.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listH.get(i2);
            if (c().a(((SemanticsNode) obj).g)) {
                function2.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final IntObjectMap c() {
        if (this.j) {
            this.j = false;
            this.m = SemanticsUtils_androidKt.b(this.d.getSemanticsOwner());
            this.n = System.currentTimeMillis();
        }
        return this.m;
    }

    public final boolean d() {
        return this.f != null;
    }

    public final void e() {
        AutofillId autofillIdB;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.f;
        if (contentCaptureSessionCompat != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.g;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) arrayList.get(i);
                int iOrdinal = contentCaptureEvent.getC().ordinal();
                if (iOrdinal == 0) {
                    ViewStructureCompat viewStructureCompatB = contentCaptureEvent.getD();
                    if (viewStructureCompatB != null) {
                        contentCaptureSessionCompat.d(viewStructureCompatB.h());
                    }
                } else if (iOrdinal == 1 && (autofillIdB = contentCaptureSessionCompat.b(contentCaptureEvent.getF1735a())) != null) {
                    contentCaptureSessionCompat.e(autofillIdB);
                }
            }
            contentCaptureSessionCompat.a();
            arrayList.clear();
        }
    }

    public final void f() {
        AccessibilityAction accessibilityAction;
        Function0 function0;
        this.i = TranslateStatus.d;
        IntObjectMap intObjectMapC = c();
        Object[] objArr = intObjectMapC.c;
        long[] jArr = intObjectMapC.f678a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        SemanticsConfiguration semanticsConfiguration = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).f1982a.d;
                        if (SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.B) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsActions.m)) != null && (function0 = (Function0) accessibilityAction.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void g(long[] jArr, Consumer consumer) {
        ViewTranslationHelperMethods.b(this, jArr, consumer);
    }

    public final void h() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        this.i = TranslateStatus.d;
        IntObjectMap intObjectMapC = c();
        Object[] objArr = intObjectMapC.c;
        long[] jArr = intObjectMapC.f678a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        SemanticsConfiguration semanticsConfiguration = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).f1982a.d;
                        if (Intrinsics.c(SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.B), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsActions.l)) != null && (function1 = (Function1) accessibilityAction.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void i() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        this.i = TranslateStatus.e;
        IntObjectMap intObjectMapC = c();
        Object[] objArr = intObjectMapC.c;
        long[] jArr = intObjectMapC.f678a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        SemanticsConfiguration semanticsConfiguration = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).f1982a.d;
                        if (Intrinsics.c(SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.B), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsActions.l)) != null && (function1 = (Function1) accessibilityAction.b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void k(SemanticsNode semanticsNode, final SemanticsNodeCopy semanticsNodeCopy) {
        b(semanticsNode, new Function2<Integer, SemanticsNode, Unit>() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$sendContentCaptureAppearEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Number) obj).intValue();
                SemanticsNode semanticsNode2 = (SemanticsNode) obj2;
                boolean zA = semanticsNodeCopy.b.a(semanticsNode2.g);
                Unit unit = Unit.f24250a;
                if (!zA) {
                    AndroidContentCaptureManager androidContentCaptureManager = this;
                    androidContentCaptureManager.m(iIntValue, semanticsNode2);
                    androidContentCaptureManager.k.k(unit);
                }
                return unit;
            }
        });
        List listH = SemanticsNode.h(4, semanticsNode);
        int size = listH.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) listH.get(i);
            IntObjectMap intObjectMapC = c();
            int i2 = semanticsNode2.g;
            if (intObjectMapC.a(i2)) {
                MutableIntObjectMap mutableIntObjectMap = this.o;
                if (mutableIntObjectMap.a(i2)) {
                    Object objB = mutableIntObjectMap.b(i2);
                    if (objB == null) {
                        throw androidx.camera.core.impl.b.w("node not present in pruned tree before this change");
                    }
                    k(semanticsNode2, (SemanticsNodeCopy) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void l(int i, String str) {
        ContentCaptureSessionCompat contentCaptureSessionCompat;
        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionCompat = this.f) != null) {
            AutofillId autofillIdB = contentCaptureSessionCompat.b(i);
            if (autofillIdB == null) {
                throw androidx.camera.core.impl.b.w("Invalid content capture ID");
            }
            contentCaptureSessionCompat.f(autofillIdB, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r10, androidx.compose.ui.semantics.SemanticsNode r11) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.m(int, androidx.compose.ui.semantics.SemanticsNode):void");
    }

    public final void n(SemanticsNode semanticsNode) {
        if (d()) {
            this.g.add(new ContentCaptureEvent(semanticsNode.g, this.n, ContentCaptureEventType.e, null));
            List listH = SemanticsNode.h(4, semanticsNode);
            int size = listH.size();
            for (int i = 0; i < size; i++) {
                n((SemanticsNode) listH.get(i));
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.f = (ContentCaptureSessionCompat) this.e.invoke();
        m(-1, this.d.getSemanticsOwner().a());
        e();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        n(this.d.getSemanticsOwner().a());
        e();
        this.f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.l.removeCallbacks(this.r);
        this.f = null;
    }
}
