package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.common.internal.ImagesContract;
import com.salesforce.marketingcloud.messages.iam.j;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Visibilities {

    /* renamed from: a, reason: collision with root package name */
    public static final MapBuilder f24346a;

    /* loaded from: classes.dex */
    public static final class Inherited extends Visibility {
        public static final Inherited c = new Inherited("inherited", false);
    }

    /* loaded from: classes.dex */
    public static final class Internal extends Visibility {
        public static final Internal c = new Internal("internal", false);
    }

    /* loaded from: classes.dex */
    public static final class InvisibleFake extends Visibility {
        public static final InvisibleFake c = new InvisibleFake("invisible_fake", false);
    }

    /* loaded from: classes.dex */
    public static final class Local extends Visibility {
        public static final Local c = new Local(ImagesContract.LOCAL, false);
    }

    /* loaded from: classes.dex */
    public static final class Private extends Visibility {
        public static final Private c = new Private("private", false);
    }

    /* loaded from: classes.dex */
    public static final class PrivateToThis extends Visibility {
        public static final PrivateToThis c = new PrivateToThis("private_to_this", false);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final String b() {
            return "private/*private to this*/";
        }
    }

    /* loaded from: classes.dex */
    public static final class Protected extends Visibility {
        public static final Protected c = new Protected("protected", true);
    }

    /* loaded from: classes.dex */
    public static final class Public extends Visibility {
        public static final Public c = new Public("public", true);
    }

    /* loaded from: classes.dex */
    public static final class Unknown extends Visibility {
        public static final Unknown c = new Unknown(j.h, false);
    }

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(PrivateToThis.c, 0);
        mapBuilder.put(Private.c, 0);
        mapBuilder.put(Internal.c, 1);
        mapBuilder.put(Protected.c, 1);
        mapBuilder.put(Public.c, 2);
        f24346a = mapBuilder.b();
    }

    public static Integer a(Visibility visibility, Visibility second) {
        Intrinsics.h(second, "second");
        if (visibility == second) {
            return 0;
        }
        MapBuilder mapBuilder = f24346a;
        Integer num = (Integer) mapBuilder.get(visibility);
        Integer num2 = (Integer) mapBuilder.get(second);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }
}
