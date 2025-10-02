package au.com.woolworths.rewards.base.info;

import android.os.Parcelable;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0003\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/rewards/base/info/FeatureInfoItem;", "Landroid/os/Parcelable;", "Companion", "Lau/com/woolworths/rewards/base/info/FeatureInfoBulletItem;", "Lau/com/woolworths/rewards/base/info/FeatureInfoHeading;", "Lau/com/woolworths/rewards/base/info/FeatureInfoTextItem;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public interface FeatureInfoItem extends Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f9373a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/base/info/FeatureInfoItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/base/info/FeatureInfoItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f9373a = new Companion();

        @NotNull
        public final KSerializer<FeatureInfoItem> serializer() {
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            return new SealedClassSerializer("au.com.woolworths.rewards.base.info.FeatureInfoItem", reflectionFactory.b(FeatureInfoItem.class), new KClass[]{reflectionFactory.b(FeatureInfoBulletItem.class), reflectionFactory.b(FeatureInfoHeading.class), reflectionFactory.b(FeatureInfoTextItem.class)}, new KSerializer[]{FeatureInfoBulletItem$$serializer.f9370a, FeatureInfoHeading$$serializer.f9372a, FeatureInfoTextItem$$serializer.f9374a}, new Annotation[0]);
        }
    }
}
