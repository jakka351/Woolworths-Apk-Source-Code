package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/path/LinkFollowing;", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LinkFollowing {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f24264a;

    static {
        LinkOption linkOption = LinkOption.NOFOLLOW_LINKS;
        f24264a = SetsKt.i(FileVisitOption.FOLLOW_LINKS);
    }
}
