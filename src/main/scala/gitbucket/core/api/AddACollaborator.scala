package gitbucket.core.api

case class AddACollaborator(permission: String) {
  val role: String = permission match {
    case "admin" &  "review"  => "ADMIN"
    case "push"  &  "review"  => "DEVELOPER"
    case "pull"               => "GUEST"
  }
}
