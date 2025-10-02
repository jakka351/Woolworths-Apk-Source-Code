package au.com.woolworths.foundation.rewards.common.ui.iconasset;

import android.content.res.Resources;
import androidx.compose.material.icons.outlined.SearchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import au.com.woolworths.compose.utils.modifier.ConditionalModifierKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.rewards.base.data.IconAssetKt;
import au.com.woolworths.rewards.base.data.LocalAssetIconName;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class IconAssetUiKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8584a;

        static {
            int[] iArr = new int[LocalAssetIconName.values().length];
            try {
                iArr[LocalAssetIconName.ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalAssetIconName.ARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalAssetIconName.CART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalAssetIconName.CHEVRON_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalAssetIconName.CHEVRON_RIGHT_SMALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalAssetIconName.COPY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LocalAssetIconName.ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LocalAssetIconName.FEEDBACK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LocalAssetIconName.GREEN_TICK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LocalAssetIconName.HELP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LocalAssetIconName.INFO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LocalAssetIconName.INVOICE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LocalAssetIconName.RECEIPT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LocalAssetIconName.RETURNS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LocalAssetIconName.REWARDS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LocalAssetIconName.SEARCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LocalAssetIconName.STORE_LOCATION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LocalAssetIconName.SUBSCRIBER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LocalAssetIconName.TRUCK.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[LocalAssetIconName.VISIBILITY_ON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            f8584a = iArr;
        }
    }

    public static final void a(IconAsset.HostedIcon hostedIcon, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1179166710);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(hostedIcon) : composerImplV.I(hostedIcon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            String url = hostedIcon.getUrl();
            boolean zBooleanValue = ((Boolean) composerImplV.x(InspectionModeKt.f1972a)).booleanValue();
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.a(3);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            SingletonAsyncImageKt.a(url, null, ConditionalModifierKt.b(modifier, zBooleanValue, (Function1) objG, null, 4), null, null, composerImplV, 48, 2040);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(hostedIcon, i, 20, modifier);
        }
    }

    public static final void b(IconAsset iconAsset, long j, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Intrinsics.h(iconAsset, "iconAsset");
        ComposerImpl composerImplV = composer.v(1623118201);
        if ((i & 6) == 0) {
            i3 = (composerImplV.I(iconAsset) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.s(j) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            Modifier modifier3 = modifier;
            if (iconAsset instanceof IconAsset.HostedIcon) {
                composerImplV.o(1572684728);
                a((IconAsset.HostedIcon) iconAsset, modifier3, composerImplV, ((i3 >> 3) & 112) | IconAsset.HostedIcon.$stable);
                composerImplV.V(false);
            } else if (iconAsset instanceof IconAsset.LocalAsset) {
                composerImplV.o(1572802187);
                c((IconAsset.LocalAsset) iconAsset, j, modifier3, composerImplV, IconAsset.LocalAsset.$stable | (i3 & 112) | (i3 & 896));
                composerImplV.V(false);
            } else {
                if (!(iconAsset instanceof IconAsset.CoreIcon)) {
                    throw au.com.woolworths.android.onesite.a.w(743467185, composerImplV, false);
                }
                composerImplV.o(1573066028);
                c(IconAssetKt.toIconAsset(LocalAssetIconName.UNKNOWN), j, modifier3, composerImplV, IconAsset.LocalAsset.$stable | (i3 & 112) | (i3 & 896));
                composerImplV.V(false);
            }
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(iconAsset, j, modifier2, i, i2, 0);
        }
    }

    public static final void c(final IconAsset.LocalAsset localAsset, final long j, final Modifier modifier, Composer composer, final int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int i2;
        final long j2;
        final Modifier modifier2;
        ImageVector imageVectorB;
        ComposerImpl composerImplV = composer.v(2096934623);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(localAsset) : composerImplV.I(localAsset) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= composerImplV.s(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            switch (WhenMappings.f8584a[localAsset.getIconName().ordinal()]) {
                case 1:
                    composerImplV.o(814519824);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_account_circle, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 2:
                    composerImplV.o(814522957);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_track_arrow, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 3:
                    composerImplV.o(814525958);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_cart, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 4:
                    composerImplV.o(814529045);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_asset_chevron_right, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 5:
                    composerImplV.o(814532795);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_asset_chevron_right_small, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 6:
                    composerImplV.o(814536238);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_rewards_copy, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 7:
                    composerImplV.o(814539311);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_rewards_error, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 8:
                    composerImplV.o(814542506);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_feedback, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 9:
                    composerImplV.o(814545613);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_tick_circle, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 10:
                    composerImplV.o(814548614);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_help, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 11:
                    composerImplV.o(814551398);
                    imageVectorB = VectorResources_androidKt.b(2131231409, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 12:
                    composerImplV.o(814554289);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_rewards_invoice, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 13:
                    composerImplV.o(814557513);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_receipt, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 14:
                    composerImplV.o(814560489);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_returns, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 15:
                    composerImplV.o(814563475);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_rewards_leaf_logo, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 16:
                    composerImplV.o(814566789);
                    composerImplV.V(false);
                    imageVectorB = SearchKt.f1371a;
                    if (imageVectorB == null) {
                        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = VectorKt.f1820a;
                        SolidColor solidColor = new SolidColor(Color.b);
                        PathBuilder pathBuilder = new PathBuilder();
                        pathBuilder.i(15.5f, 14.0f);
                        pathBuilder.f(-0.79f);
                        pathBuilder.h(-0.28f, -0.27f);
                        pathBuilder.b(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
                        pathBuilder.b(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
                        pathBuilder.j(3.0f, 5.91f, 3.0f, 9.5f);
                        pathBuilder.j(5.91f, 16.0f, 9.5f, 16.0f);
                        pathBuilder.c(1.61f, BitmapDescriptorFactory.HUE_RED, 3.09f, -0.59f, 4.23f, -1.57f);
                        pathBuilder.h(0.27f, 0.28f);
                        pathBuilder.m(0.79f);
                        pathBuilder.h(5.0f, 4.99f);
                        pathBuilder.g(20.49f, 19.0f);
                        pathBuilder.h(-4.99f, -5.0f);
                        pathBuilder.a();
                        pathBuilder.i(9.5f, 14.0f);
                        pathBuilder.b(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
                        pathBuilder.j(7.01f, 5.0f, 9.5f, 5.0f);
                        pathBuilder.j(14.0f, 7.01f, 14.0f, 9.5f);
                        pathBuilder.j(11.99f, 14.0f, 9.5f, 14.0f);
                        pathBuilder.a();
                        builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
                        imageVectorB = builder.d();
                        SearchKt.f1371a = imageVectorB;
                        break;
                    }
                    break;
                case 17:
                    composerImplV.o(814568880);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_store_location, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 18:
                    composerImplV.o(814572180);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_rewards_subscriber, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 19:
                    composerImplV.o(814575440);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_truck_delivery, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                case 20:
                    composerImplV.o(814578831);
                    imageVectorB = VectorResources_androidKt.b(R.drawable.ic_visibility_on, 6, composerImplV);
                    composerImplV.V(false);
                    break;
                default:
                    composerImplV.o(-517796835);
                    composerImplV.V(false);
                    RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                    if (recomposeScopeImplX != null) {
                        final int i4 = 0;
                        recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.foundation.rewards.common.ui.iconasset.b
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, Resources.NotFoundException, IOException {
                                switch (i4) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        IconAssetUiKt.c(localAsset, j2, modifier2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        IconAssetUiKt.c(localAsset, j2, modifier2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                                        break;
                                }
                                return Unit.f24250a;
                            }
                        };
                        return;
                    }
                    return;
            }
            IconKt.b(imageVectorB, null, modifier, j, composerImplV, (i2 & 896) | 48 | ((i2 << 6) & 7168), 0);
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i5 = 1;
            recomposeScopeImplX2.d = new Function2() { // from class: au.com.woolworths.foundation.rewards.common.ui.iconasset.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, Resources.NotFoundException, IOException {
                    switch (i5) {
                        case 0:
                            ((Integer) obj2).getClass();
                            IconAssetUiKt.c(localAsset, j, modifier, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            IconAssetUiKt.c(localAsset, j, modifier, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
