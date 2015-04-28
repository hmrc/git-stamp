package uk.gov.hmrc.gitstamp;

import org.eclipse.jgit.lib.Repository;

import java.util.Map;

@SuppressWarnings("unused")
public final class JGitStamp {
    private JGitStamp() {}

    public static Map<String, String> gitStamp() throws Exception {
        return GitStamp.gitStamp();
    }

    private static Map<String, String> gitStamp(Repository repository) {
        return GitStamp.gitStamp(repository);
    }
}
