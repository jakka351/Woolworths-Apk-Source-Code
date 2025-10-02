package androidx.activity.contextaware;

import androidx.activity.ComponentActivity;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/contextaware/ContextAwareHelper;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ContextAwareHelper {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f73a = new CopyOnWriteArraySet();
    public volatile ComponentActivity b;
}
