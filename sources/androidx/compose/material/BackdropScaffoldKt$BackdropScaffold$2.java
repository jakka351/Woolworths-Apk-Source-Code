package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.CryptoServicesPermission;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class BackdropScaffoldKt$BackdropScaffold$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/ui/unit/Constraints;", "backLayerHeight", "", "invoke-jYbf7pk", "(JFLandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function4<Constraints, Float, Composer, Integer, Unit> {

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3, reason: invalid class name */
        final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                    PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 7);
                    throw null;
                }
                composer.j();
                return Unit.f24250a;
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i;
            long j = ((Constraints) obj).f2197a;
            float fFloatValue = ((Number) obj2).floatValue();
            Composer composer = (Composer) obj3;
            int iIntValue = ((Number) obj4).intValue();
            if ((iIntValue & 6) == 0) {
                i = (composer.s(j) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i |= composer.q(fFloatValue) ? 32 : 16;
            }
            if (!composer.z(i & 1, (i & 147) != 146)) {
                composer.j();
                return Unit.f24250a;
            }
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            float fG = Constraints.g(j);
            final float f = BitmapDescriptorFactory.HUE_RED;
            floatRef.d = fG - BitmapDescriptorFactory.HUE_RED;
            final BackdropScaffoldState backdropScaffoldState = null;
            AnchoredDraggableKt.c(new DraggableAnchorsElement(null, new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<BackdropValue>, ? extends BackdropValue>>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.2.1.1

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[BackdropValue.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            BackdropValue backdropValue = BackdropValue.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    BackdropValue backdropValue;
                    long j2 = ((IntSize) obj5).f2202a;
                    long j3 = ((Constraints) obj6).f2197a;
                    final float f2 = (int) (4294967295L & j2);
                    final float f3 = f;
                    final float f4 = f2 - f3;
                    final Ref.FloatRef floatRef2 = floatRef;
                    DraggableAnchors draggableAnchorsA = AnchoredDraggableKt.a(new Function1<DraggableAnchorsConfig<BackdropValue>, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$1$newAnchors$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r3) {
                            /*
                                r2 = this;
                                androidx.compose.material.DraggableAnchorsConfig r3 = (androidx.compose.material.DraggableAnchorsConfig) r3
                                r0 = 0
                                float r1 = r1
                                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                                if (r0 != 0) goto La
                                goto L10
                            La:
                                float r0 = r2
                                int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                                if (r1 != 0) goto L18
                            L10:
                                androidx.compose.material.BackdropValue r0 = androidx.compose.material.BackdropValue.d
                                float r1 = r3
                                r3.a(r0, r1)
                                goto L26
                            L18:
                                androidx.compose.material.BackdropValue r1 = androidx.compose.material.BackdropValue.d
                                r3.a(r1, r0)
                                androidx.compose.material.BackdropValue r0 = androidx.compose.material.BackdropValue.e
                                kotlin.jvm.internal.Ref$FloatRef r1 = r4
                                float r1 = r1.d
                                r3.a(r0, r1)
                            L26:
                                kotlin.Unit r3 = kotlin.Unit.f24250a
                                return r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$1$newAnchors$1.invoke(java.lang.Object):java.lang.Object");
                        }
                    });
                    int iOrdinal = ((BackdropValue) backdropScaffoldState.b.h.getD()).ordinal();
                    if (iOrdinal == 0) {
                        backdropValue = BackdropValue.d;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        backdropValue = BackdropValue.e;
                        if (!((MapDraggableAnchors) draggableAnchorsA).f1296a.containsKey(backdropValue)) {
                            backdropValue = BackdropValue.d;
                        }
                    }
                    return new Pair(draggableAnchorsA, backdropValue);
                }
            }), null, Orientation.d, false, false, 56);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
            composer.j();
            return Unit.f24250a;
        }
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = a.i(composer.y(), composer);
        }
        SizeKt.d(null);
        throw null;
    }
}
