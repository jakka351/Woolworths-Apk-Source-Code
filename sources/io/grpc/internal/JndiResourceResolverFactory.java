package io.grpc.internal;

import android.annotation.SuppressLint;
import com.google.common.annotations.VisibleForTesting;
import io.grpc.internal.DnsNameResolver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes7.dex */
final class JndiResourceResolverFactory implements DnsNameResolver.ResourceResolverFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final Throwable f24030a;

    @SuppressLint
    @IgnoreJRERequirement
    @VisibleForTesting
    public static final class JndiRecordFetcher implements RecordFetcher {
        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        public static void a(NamingEnumeration namingEnumeration, NamingException namingException) throws NamingException {
            try {
                namingEnumeration.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        public static void b(DirContext dirContext, NamingException namingException) throws NamingException {
            try {
                dirContext.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        public final ArrayList c(String str) throws NamingException {
            Throwable th = JndiResourceResolverFactory.f24030a;
            if (th != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", th);
            }
            String[] strArr = {"TXT"};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e) {
                                a(all2, e);
                                throw null;
                            }
                        }
                        all2.close();
                    } catch (NamingException e2) {
                        a(all, e2);
                        throw null;
                    }
                }
                all.close();
                initialDirContext.close();
                return arrayList;
            } catch (NamingException e3) {
                b(initialDirContext, e3);
                throw null;
            }
        }
    }

    @VisibleForTesting
    public static final class JndiResourceResolver implements DnsNameResolver.ResourceResolver {
        public static final Logger b = Logger.getLogger(JndiResourceResolver.class.getName());

        /* renamed from: a, reason: collision with root package name */
        public final JndiRecordFetcher f24031a;

        static {
            Pattern.compile("\\s+");
        }

        public JndiResourceResolver(JndiRecordFetcher jndiRecordFetcher) {
            this.f24031a = jndiRecordFetcher;
        }

        @Override // io.grpc.internal.DnsNameResolver.ResourceResolver
        public final List a(String str) throws NamingException {
            Level level = Level.FINER;
            Logger logger = b;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            ArrayList arrayListC = this.f24031a.c(YU.a.A("dns:///", str));
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(arrayListC.size())});
            }
            ArrayList arrayList = new ArrayList(arrayListC.size());
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                StringBuilder sb = new StringBuilder(str2.length());
                int i = 0;
                boolean z = false;
                while (i < str2.length()) {
                    char cCharAt = str2.charAt(i);
                    if (z) {
                        if (cCharAt == '\"') {
                            z = false;
                        } else {
                            if (cCharAt == '\\') {
                                i++;
                                cCharAt = str2.charAt(i);
                            }
                            sb.append(cCharAt);
                        }
                    } else if (cCharAt != ' ') {
                        if (cCharAt == '\"') {
                            z = true;
                        } else {
                            sb.append(cCharAt);
                        }
                    }
                    i++;
                }
                arrayList.add(sb.toString());
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    @VisibleForTesting
    public interface RecordFetcher {
    }

    static {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            e = null;
        } catch (ClassNotFoundException e) {
            e = e;
        } catch (Error e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        }
        f24030a = e;
    }

    @Override // io.grpc.internal.DnsNameResolver.ResourceResolverFactory
    public final DnsNameResolver.ResourceResolver a() {
        if (f24030a != null) {
            return null;
        }
        return new JndiResourceResolver(new JndiRecordFetcher());
    }

    @Override // io.grpc.internal.DnsNameResolver.ResourceResolverFactory
    public final Throwable b() {
        return f24030a;
    }
}
