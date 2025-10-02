package dagger.hilt.android.flags;

import android.content.Context;
import dagger.Module;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.internal.Preconditions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.AbstractCollection;
import java.util.Set;
import javax.inject.Qualifier;

/* loaded from: classes7.dex */
public final class FragmentGetContextFix {

    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
    @Qualifier
    public @interface DisableFragmentGetContextFix {
    }

    @EntryPoint
    @InstallIn
    /* loaded from: classes.dex */
    public interface FragmentGetContextFixEntryPoint {
        Set D();
    }

    @Module
    @InstallIn
    public static abstract class FragmentGetContextFixModule {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Context context) {
        Set setD = ((FragmentGetContextFixEntryPoint) EntryPointAccessors.a(context, FragmentGetContextFixEntryPoint.class)).D();
        Preconditions.a(setD.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (((AbstractCollection) setD).isEmpty()) {
            return true;
        }
        return ((Boolean) setD.iterator().next()).booleanValue();
    }
}
