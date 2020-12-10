package in.xiaocao.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import in.xiaocao.dto.IPPolicy;
import in.xiaocao.dto.Policy;
import in.xiaocao.dto.UrlPolicy;

@Component
@ConfigurationProperties(prefix = "xiaocao.rate.limit")
public class RateLimitConfig {
	
	private Policy defaultPolicy; // 默认限流策略
	
	private Policy ipPolicy; // ip限流策略
	
	private Map<String, IPPolicy> perIpPolicyMap = new HashMap<String, IPPolicy>(); // 每个ip限流策略
	
	private Policy urlPolicy; // url限流策略
	
	private Map<String, UrlPolicy> perUrlPolicyMap = new HashMap<>(); // 每个url限流策略
	

	public Policy getIpPolicy() {
		return ipPolicy;
	}

	public void setIpPolicy(Policy ipPolicy) {
		this.ipPolicy = ipPolicy;
	}
	
	public Map<String, IPPolicy> getPerIpPolicyMap() {
		return perIpPolicyMap;
	}
	
	public void setPerIpPolicies(List<IPPolicy> perIpPolicies) {
		if (perIpPolicies != null) {
			perIpPolicies.forEach(policy -> {
				Stream.of(policy.getIp().split(",")).forEach(ip -> {
					IPPolicy each = new IPPolicy();
					each.setIp(ip);
					each.setInterval(policy.getInterval());
					each.setLimit(policy.getLimit());
					perIpPolicyMap.put(ip, each);
				});
			});
		}
	}
	
	public Policy getUrlPolicy() {
		return urlPolicy;
	}

	public void setUrlPolicy(Policy urlPolicy) {
		this.urlPolicy = urlPolicy;
	}

	public Map<String, UrlPolicy> getPerUrlPolicyMap() {
		return perUrlPolicyMap;
	}

	public void setPerUrlPolicies(List<UrlPolicy> perUrlPolicies) {
		if (perUrlPolicies != null) {
			perUrlPolicies.forEach(policy -> {
				Stream.of(policy.getUrl().split(",")).forEach(url -> {
					UrlPolicy each = new UrlPolicy();
					each.setUrl(url);
					each.setInterval(policy.getInterval());
					each.setLimit(policy.getLimit());
					perUrlPolicyMap.put(url, each);
				});
			});
		}
	}

	public Policy getDefaultPolicy() {
		return defaultPolicy;
	}

	public void setDefaultPolicy(Policy defaultPolicy) {
		this.defaultPolicy = defaultPolicy;
	}
}
