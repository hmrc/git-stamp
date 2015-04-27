package uk.gov.hmrc.gitstamp;

import org.eclipse.jgit.lib.Repository;

import java.util.Map;

@SuppressWarnings("unused")
public final class JGitStamp {
    private JGitStamp() {}

    public Map<String, String> gitStamp() throws Exception {
        return GitStamp.gitStamp();
    }

    private Map<String, String> gitStamp(Repository repository) {
        return GitStamp.gitStamp(repository);
    }
}
