require 'json'
pjson = JSON.parse(File.read('package.json'))

Pod::Spec.new do |s|

  s.name            = "MTPush"
  s.version         = pjson["version"]
  s.homepage        = pjson["homepage"]
  s.summary         = pjson["description"]
  s.license         = pjson["license"]
  s.author          = pjson["author"]
  
  s.ios.deployment_target = '7.0'

  s.source          = { :git => "https://github.com/DevEngageLab/push-rectnative-plugin", :tag => "#{s.version}" }
  s.source_files    = 'ios/RCTMTPushModule/*.{h,m}'
  s.preserve_paths  = "*.js"
  s.frameworks      = 'UIKit','CFNetwork','CoreFoundation','CoreTelephony','SystemConfiguration','CoreGraphics','Foundation','Security'
  s.weak_frameworks = 'UserNotifications'
  s.libraries       = 'z','resolv'
  s.vendored_frameworks = "ios/RCTMTPushModule/*.xcframework"
  s.dependency 'React'
end
