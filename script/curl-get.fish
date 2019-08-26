#!/usr/bin/env fish

function curl-get
  argparse -n curl-get 'h/help' 't/target=' -- $argv
  or return 1

  if set -lq _flag_help
    echo "angular-cli.fish <COMMAND>"
    echo "angular-cli.fish -t/--target <TARGET_URL>"
    return
  end

  set -lq _flag_target $argv
  or set -l _flag_target "http://localhost:8080"

  echo $_flag_target
  curl -X GET $_flag_target 
end

curl-get $argv
